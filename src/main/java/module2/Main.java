package module2;

import module2.model.Customer;
import module2.model.Invoice;
import module2.service.PersonService;
import module2.service.ShopService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Invoice> list = new ArrayList<>();
        ShopService shop = new ShopService();
        PersonService service = new PersonService();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            customers.add(service.getNewCustomer());
            list.add(shop.createOrder(customers.get(i), 1500));
        }
        Analytics analyticalData = new Analytics(list);
        System.out.println("Количество проданных товаров по категориям:");
        analyticalData.soldByCategory();
        System.out.println("Сумма самого маленького чека и информация о покупателе:");
        analyticalData.smallestCheckInfo();
        System.out.println("Сумма всех покупок:");
        analyticalData.sumOfPurchases();
        System.out.println("Количество чеков с категорией retail:");
        analyticalData.retailCheck();
        System.out.println("Чеки которые содержат только один тип товара:");
        analyticalData.oneTypeCheck();
        System.out.println("Первые три чека сделанные покупателями:");
        analyticalData.firstThreeChecks(customers);
        System.out.println("Low age чеки:");
        analyticalData.lowAgeCheks();
        System.out.println("Отсортированные инвойсы:");
        analyticalData.sortedInvoices();
    }
}
