package ThirdTask;

public class Calculator {
//    public int calculate(char op, int a, int b) {
//        int result = 0;
//        if (op == '+')
//            result = a + b;
//        else if (op == '-')
//            result = a - b;
//        else if (op =='*')
//            result = a * b;
//        else if (op == '/')
//            result = a / b;
//        else
//            System.out.println("Некорректный оператор: 'оператор'");
//        return result;
//    }

    public int calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return add(a, b);
            case '-':
                return minus(a, b);
            case '*':
                return mult(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + op);
        }
    }

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }
}
