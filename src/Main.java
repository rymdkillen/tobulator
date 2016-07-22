import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("plussa ihop nåra tal:");

        String input = scanner.nextLine();


        //gör bara en fucking string som du vandrar igenom och sorterar ur på nåt jävla sätt... nummer i en array eller nåt, operator i en annan



        String[] tokens = input.split("\\+");

        double token1 = Double.parseDouble(tokens[0]);
        double token2 = Double.parseDouble(tokens[1]);

        double answer = calculator.add(token1, token2);

        System.out.println(answer);


        /*double inputA = scanner.nextDouble();
        //char c = scanner.next().charAt(0);
        //scanner.nextLine();
        double inputB = scanner.nextDouble();
        scanner.nextLine();

        double answer = calculator.add(inputA, inputB);

        System.out.println(answer);*/

        /*System.out.println(inputA);
        System.out.println(c);
        System.out.println(inputB);*/






        /*String input = scanner.nextLine();
        String[] parts = input.split("");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

        ArrayList<Integer> numlist = new ArrayList<>();

        public void isNumber() {
            if (input.startsWith("1")) {
                numlist.add(1);
            }
        }

        System.out.println(numlist);*/







        /*int[] n1 = new int[parts.length];
        for (int n = 0; n < parts.length; n++) {
            n1[n] = Integer.parseInt(parts[n]);
        }


        //kolla sen om det är en siffra först, sen om det är ett + osv
        //om + gör plus, om annat gör det


        int sum = 0;

        for (int num : n1) {
            sum = sum + num;
        }

        System.out.println(sum);*/
    }
}
