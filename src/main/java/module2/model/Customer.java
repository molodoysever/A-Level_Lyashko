package module2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter

public class Customer {
    private int id;
    private String email;
    private int age;
}
