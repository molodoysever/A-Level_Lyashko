package hw6;

public enum Manufacturer {
    BMW ("БМВ"), AUDI("Ауди");

    private final String russianName;

    Manufacturer (String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
