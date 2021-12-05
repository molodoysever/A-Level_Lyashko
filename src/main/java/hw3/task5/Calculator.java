package hw3.task5;

public class Calculator {
    private int result;
    public int getResult(UserInput userInput) {
        char temp;
        do {
            System.out.println("Введите символ");
            char symbol = userInput.getSymbol();
            temp = symbol;
            if (symbol != 0) {
                System.out.println("Введите первое число");
                int num1 = userInput.getNum1();
                System.out.println("Введите второе число");
                int num2 = userInput.getNum2();
                switch (symbol) {
                    case ('+'):
                        result = (num1 + num2);
                        break;
                    case ('-'):
                        result = (num1 - num2);
                        break;
                    case ('/'):
                        if (num2 != 0) {
                            result = (num1 / num2);
                        } else {
                            result = -53;
                        }
                        break;
                    case ('*'):
                        result = (num1 * num2);
                        break;
                }
            } return result;
        } while (temp == '0') ;
    }
}
