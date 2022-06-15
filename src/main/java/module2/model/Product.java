package module2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Product {
    protected String series;
    protected String screenType;
    protected int price;
}
