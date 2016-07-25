import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private String token = "";

    public double readInput(String exp) {
        Scanner input = new Scanner(exp);

        Stack<Double> number = new Stack<Double>();
        Stack<String> operator = new Stack<String>();

        while (input.hasNext()) {
            token = input.next();

            if (isNumber(token)) {
                number.push(Double.parseDouble(token));
                System.out.println(number);
            }
            else if (token.equals("+")) {
                operator.push(token);
                System.out.println(operator);
            }
        }
        return number.pop();
    }

    public boolean isOperator(String exp) {
        if (exp.equals("+")) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isNumber(String exp) {
        if (exp.startsWith("0")) {
            return true;
        }
        else if (exp.startsWith("1")) {
            return true;
        }
        else if (exp.startsWith("2")) {
            return true;
        }
        else if (exp.startsWith("3")) {
            return true;
        }
        else if (exp.startsWith("4")) {
            return true;
        }
        else if (exp.startsWith("5")) {
            return true;
        }
        else if (exp.startsWith("6")) {
            return true;
        }
        else if (exp.startsWith("7")) {
            return true;
        }
        else if (exp.startsWith("8")) {
            return true;
        }
        else if (exp.startsWith("9")) {
            return true;
        }
        else {
            return false;
        }
    }
}
