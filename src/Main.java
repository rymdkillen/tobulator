import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculate = new Calculator();

        String input = scanner.nextLine();
        calculate.readInput(input);
    }
}
