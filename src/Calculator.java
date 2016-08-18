import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private String token = "";

    public double calculateInput(String userInput) {
        Scanner input = new Scanner(userInput);

        Stack<Double> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        token = input.nextLine();
        String[] tokens = token.split("\\s+");

        for (int i = 0; i < tokens.length; i++) {
            if (isNumber(tokens[i])) {
                double numDouble = Double.parseDouble(tokens[i]);
                numbers.push(numDouble);
            }
            else if (isOperator(tokens[i])) {
                operators.push(tokens[i]);
            }
            else {
                System.out.println("That was not a number!");
            }
        }

        while (operators.size() > 1) {
            numbers.push(evaluate(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return evaluate(operators.pop(), numbers.pop(), numbers.pop());
    }

    public boolean isOperator(String operator) {
        if (operator.equals("+")) {
            return true;
        }
        else if (operator.equals("-")) {
            return true;
        }
        else if (operator.equals("*")) {
            return true;
        }
        else if (operator.equals("/")) {
            return true;
        }
        else {
            return false;
        }
    }

    // Why am I using try catch here?
    public boolean isNumber(String number) {
        try {
            Double.parseDouble(number);
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
