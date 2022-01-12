package module2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Invoice {
    private Customer customer;
    private String type;
    private List <Product> list;

    public Invoice(List<Product> list, int limit, Customer customer) {
        this.list = list;
        this.customer = customer;
        final int totalPrice = list.stream()
                .mapToInt(Product::getPrice)
                .sum();
        if (totalPrice < limit) {
            type = "retail";
        } else {
            type = "wholesale";
        }
    }
}