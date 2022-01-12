package module2.service;

import com.opencsv.CSVReader;
import module2.IncorrectStringExc;
import module2.model.*;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ShopService {
    Random random = new Random();

    private List<List<String>> reader() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/csv/catalog.csv"), ',', '"', 1);
        String[] temp;
        List<List<String>> list = new ArrayList<>();
        while ((temp = reader.readNext()) != null) {
            try {
                checkLine(Arrays.asList(temp), list.size() + 1);
                list.add(Arrays.asList(temp));
            } catch (IncorrectStringExc exception) {
                exception.printStackTrace();
            }
        }
        return list;
    }

    private Product parser(List<String> list) {
        Product product;
        if (list.get(0).equals("Telephone")) {
            product = new Telephone(list.get(2));
        } else {
            product = new Television(list.get(5), list.get(3));
        }
        product.setSeries(list.get(1));
        product.setScreenType(list.get(4));
        product.setPrice(Integer.parseInt(list.get(6)));
        return product;
    }

    private void checkLine(List<String> line, int lineNum) throws IncorrectStringExc {
        for (String s : line) {
            if (Objects.equals(s, "")) {
                throw new IncorrectStringExc("line " + (lineNum + 1) + " is incorrect");
            }
        }
    }

    public Invoice createOrder(Customer customer, int limit) throws IOException {
        List<List<String>> data = reader();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < random.nextInt(5) + 1; i++) {
            products.add(parser(data.get(random.nextInt(data.size()))));
        }
        String message = " " + customer + " " + products + " ";
        createLogs(message);
        return new Invoice(products, limit, customer);
    }

    private void createLogs(String message) throws IOException {
        final Logger logger = Logger.getLogger(ShopService.class.getName());
        FileHandler fh = new FileHandler("logger.txt", true);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.addHandler(fh);
        logger.log(Level.INFO, "Все в порядке, заказы есть");
        logger.info(message);
        fh.close();
    }
}