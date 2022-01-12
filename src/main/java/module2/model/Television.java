package module2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Television extends Product {
    private String country;
    private String diagonal;
 }
