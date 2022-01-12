package module2;

import module2.model.*;
import module2.service.PersonService;

import java.util.*;
import java.util.stream.Collectors;

public class Analytics {
    private final List<Invoice> list;
    public Analytics(List<Invoice> list) {
        this.list = list;
    }

    public void soldByCategory() {
        int telephNumb = list.stream()
                .flatMap(invoice -> invoice.getList().stream())
                .filter(product -> product.getClass().equals(Telephone.class))
                .mapToInt(quantity -> 1)
                .sum();
        int televNumb = list.stream()
                .flatMap(invoice -> invoice.getList().stream())
                .filter(product -> product.getClass().equals(Television.class))
                .mapToInt(quantity -> 1)
                .sum();
        System.out.println("telephone: " + telephNumb + "\ntelevision: " + televNumb);
    }

    public void smallestCheckInfo() {
        Invoice minInvoice = list.stream()
                .min(Comparator.comparing(invoice -> invoice.getList()
                        .stream()
                        .mapToInt(Product::getPrice)
                        .sum()))
                .orElse(new Invoice(new ArrayList<>(), 0, new PersonService().getNewCustomer()));
        System.out.println(minInvoice.getList()
                .stream()
                .mapToInt(Product::getPrice)
                .sum());
        System.out.println(minInvoice.getCustomer());
    }

    public void sumOfPurchases() {
        int sum = list.stream()
                .flatMap(invoice -> invoice.getList()
                        .stream())
                .mapToInt(Product::getPrice)
                .sum();
        System.out.println(sum);
    }

    public void retailCheck() {
        long retailQuantity = list.stream()
                .filter(invoice -> invoice.getType()
                        .equals("retail")).count();
        System.out.println(retailQuantity);
    }

    public void oneTypeCheck() {
        List<Invoice> telephoneType = list.stream()
                .filter(invoice -> invoice.getList()
                        .stream()
                        .allMatch(product -> product.getClass()
                                .equals(Telephone.class)))
                .collect(Collectors.toList());
        List<Invoice> televisionType = list.stream()
                .filter(invoice -> invoice.getList()
                        .stream()
                        .allMatch(product -> product.getClass()
                                .equals(Television.class)))
                .collect(Collectors.toList());
        System.out.println("television: " + televisionType + "\ntelephone: " + telephoneType);
    }

    public void firstThreeChecks(List<Customer> customers) {
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    public void lowAgeCheks() {
        list.stream()
                .filter(invoice -> invoice.getCustomer().getAge() < 18)
                .peek(invoice -> invoice.setType("low age"))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public void sortedInvoices() {
        System.out.println(list.stream()
                .sorted(Comparator.comparing(invoice -> -invoice.getCustomer().getAge()))
                .collect(Collectors.toList()));
        System.out.println(list.stream()
                .sorted(Comparator.comparing(invoice -> invoice.getList().size()))
                .collect(Collectors.toList()));
        System.out.println(list.stream()
                .sorted(Comparator.comparing(invoice -> invoice.getList().stream()
                        .mapToInt(Product::getPrice).sum()))
                .collect(Collectors.toList()));
    }
}