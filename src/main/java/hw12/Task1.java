package hw12;

public class Task1 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Иди чини, что-то не так");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Это не баг, это фича");
        }
    }
}
