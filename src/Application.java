import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("What do want to calculate?");

        Scanner inputScanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String userInput = inputScanner.nextLine();

        try {
            System.out.println("The answer is: " + calculator.calculateInput(userInput));
        }
        catch (Exception e) {
            System.out.println("Try again!");
        }
    }
}
