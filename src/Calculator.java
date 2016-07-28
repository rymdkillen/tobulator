import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private String token = "";

    public double readInput(String exp) {
        Scanner input = new Scanner(exp);
        //double sum = 0;

        Stack<Double> number = new Stack<>();
        Stack<String> operator = new Stack<>();

        token = input.nextLine();

        String[] array = token.split("\\s+");

        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {
                double numDouble = Double.parseDouble(array[i]);
                number.push(numDouble);
            }
            else if (isOperator(array[i])) {
                operator.push(array[i]);
            }
            else {
                System.out.println("De där va ju inge nummer");
            }
        }
        return evaluate(operator.pop(), number.pop(), number.pop());
    }

    public boolean isOperator(String exp) {
        if (exp.equals("+")) {
            return true;
        }
        else if (exp.equals("-")) {
            return true;
        }
        else if (exp.equals("*")) {
            return true;
        }
        else if (exp.equals("/")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNumber(String exp) {
        try {
            Double.parseDouble(exp);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public double evaluate(String op, double num2, double num1) {
        double sum = 0;
        if (op.equals("+")) {
            sum = num1 + num2;
        }
        else if (op.equals("-")) {
            sum = num1 - num2;
        }
        else if (op.equals("*")) {
            sum = num1 * num2;
        }
        else if (op.equals("/")) {
            sum = num1 / num2;
        }
        return sum;
    }
}
