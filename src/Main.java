import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculate = new Calculator();

        String input = scanner.nextLine();

        try {
            System.out.println(calculate.readInput(input));
        }
        catch (Exception e) {
            System.out.println("Hörrudu bosse, redär fåru göra om");
        }


    }
}
