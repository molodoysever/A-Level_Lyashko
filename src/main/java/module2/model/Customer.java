package module2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor

public class Customer {
    private int id;
    private String email;
    private int age;
}
