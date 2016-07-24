import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("plussa ihop nåra tal:");

        String input = scanner.nextLine();

        System.out.println(isNumber(input));
    }



    public static ArrayList isNumber(String jocki) {
        //Scanner igen = new Scanner(jocki);

        ArrayList<String> bosse = new ArrayList<String>();

        if (jocki.startsWith("1")) {
            bosse.add("1");
        }
        else if (jocki.startsWith("2")) {
            bosse.add("2");
        }
        return bosse;
    }
}
