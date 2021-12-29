package module2.service;

import module2.IncorrectStringExc;
import module2.Util;
import module2.model.Invoice;
import module2.model.Product;
import module2.model.Telephone;
import module2.model.Television;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static module2.Util.isBlank;

public class ShopService {
    private final Map<LocalDateTime, Invoice> invoiceMap = new LinkedHashMap<>();
    private final List<String> productsList = new ArrayList<>();
    private final List<String> patternList = new ArrayList<>();
    private final PersonService personService = new PersonService();
    private String patternString;
    private int limitRetail;

    public Map<LocalDateTime, Invoice> getInvoiceMap() {
        return invoiceMap;
    }

    public void startShopService(String targetLogFile, int numberOfPurchase) throws IncorrectStringExc {
        limitRetail = Util.getRandomInt(1000, 5000);
        fillListOfProductsFromFile();
        StringTokenizer tokenizer = new StringTokenizer(patternString, ",");
        while (tokenizer.hasMoreTokens()) {
            patternList.add(tokenizer.nextToken());
        }
        for (int i = 0; i < numberOfPurchase; i++) {
            Invoice invoice = getRandomInvoice();
            LocalDateTime dateTime = LocalDateTime.now();
            invoiceMap.put(dateTime, invoice);
            writeInvoiceToLogFile(invoice, targetLogFile, dateTime);
        }
    }

    private void fillListOfProductsFromFile() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("csv/catalog.csv");
        String line;
        if (inputStream != null) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
                patternString = bufferedReader.readLine();
                while ((line = bufferedReader.readLine()) != null) {
                    productsList.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Invoice getRandomInvoice() throws IncorrectStringExc {
        Invoice invoice = new Invoice();
        int minQuantityProductsInInvoice = 1;
        int maxQuantityProductsInInvoice = 5;
        int quantityProductsInInvoice = Util.getRandomInt(minQuantityProductsInInvoice, maxQuantityProductsInInvoice);
        for (int i = 0; i < quantityProductsInInvoice; i++) {
            int randomProductIndex = Util.getRandomInt(0, productsList.size() - 1);
            String randomProduct = productsList.get(randomProductIndex);
            String[] productArray = randomProduct.split(",");
            List<String> product = Arrays.asList(productArray);
            Map<String, String> productMap = IntStream.range(0, patternList.size())
                    .boxed()
                    .collect(Collectors.toMap(patternList::get, product::get));
            if (productMap.get("type").equals("Telephone")) {
                invoice.getProductSet().add(getTelephone(productMap));
            } else if (productMap.get("type").equals("Television")) {
                invoice.getProductSet().add(getTelevision(productMap));
            } else {
                throw new IllegalStateException("Unknown product");
            }
        }
        invoice.setCustomer(personService.getNewCustomer());
        if (getTotalPriceInvoice(invoice) <= limitRetail) {
            invoice.setType("retail");
        } else {
            invoice.setType("wholesale");
        }
        return invoice;
    }

    public int getTotalPriceInvoice(Invoice invoice) {
        return invoice.getProductSet()
                .stream()
                .map(Product::getPrice)
                .mapToInt(i -> i)
                .sum();
    }

    private Telephone getTelephone(Map<String, String> productMap) throws IncorrectStringExc {
        String series = productMap.get("series");
        String model = productMap.get("model");
        String screenType = productMap.get("screen type");
        String priceString = productMap.get("price");
        Telephone telephone;
        if (isBlank(series) || isBlank(model)
                || isBlank(screenType) || isBlank(priceString)) {
            throw new IncorrectStringExc(series);
        } else {
            int price = Integer.parseInt(priceString);
            telephone = new Telephone(series, screenType, price);
            telephone.setModel(model);
        }
        return telephone;
    }

    private Television getTelevision(Map<String, String> productMap) throws IncorrectStringExc {
        String series = productMap.get("series");
        String diagonal = productMap.get("diagonal");
        String screenType = productMap.get("screen type");
        String country = productMap.get("country");
        String priceString = productMap.get("price");
        Television television;
        if (isBlank(series) || isBlank(diagonal) || isBlank(screenType)
                || isBlank(country) || isBlank(priceString)) {
            throw new IncorrectStringExc(series);
        } else {
            int price = Integer.parseInt(priceString);
            television = new Television(series, screenType, price);
            television.setDiagonal(Integer.parseInt(diagonal));
            television.setCountry(country);
        }
        return television;
    }

    private void writeInvoiceToLogFile(Invoice invoice, String targetLogFile, LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss:SSS");
        try (FileWriter fileWriter = new FileWriter(targetLogFile, true);
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.printf("[%s]", dateTime.format(formatter));
            writer.printf("[%s]", invoice.getCustomer());
            invoice.getProductSet().forEach(x -> writer.printf("[%s]", x));
            writer.print("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
