import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    private String token = "";

    public double readInput(String exp) {
        Scanner input = new Scanner(exp);

        //input.useLocale(Locale.US);

        Stack<Double> number = new Stack<Double>();
        Stack<String> operator = new Stack<String>();

        token = input.next();

        String[] array = token.split("");

        for (int i = 0; i < array.length; i++) {

            if (isNumber(array[i])) {
                double numDouble = Double.parseDouble(array[i]);
                number.push(numDouble);
            }
            else if (isOperator(array[i])) {
                operator.push(array[i]);
            }
            //System.out.println(array[i]);
        }

        return evaluate(operator.pop(), number.pop(), number.pop());
    }


    public double evaluate(String op, double num2, double num1) {
        //double sum = 0;
        if (op.equals("+")) {
            num1 = num1 + num2;
        }
        return num1;
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
