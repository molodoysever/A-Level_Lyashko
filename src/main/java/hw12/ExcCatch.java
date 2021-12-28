package hw12;

 public class ExcCatch {
    public static void main(String[] args) throws Exception {
        ExcCatch excCatch = new ExcCatch();
        try { excCatch.throwAllThree();
        } catch (IllArgExc | NumbFormExc | RuntimeExc exception) {
            exception.printStackTrace();
        }
    }

    public void illArgExc() throws IllegalArgumentException {
        throw new IllArgExc();
    }

    public void numbFormExc() throws NumberFormatException {
        throw new NumbFormExc();
    }

    public void runtimeExc() throws RuntimeException {
        throw new RuntimeExc();
    }

    public void throwAllThree() {
        illArgExc();
        numbFormExc();
        runtimeExc();
    }
}