import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        Scanner scanner = new Scanner(System.in);


        int a = getInput(scanner, 'a');
        int b = getInput(scanner, 'b');

        System.out.println("The sum of " + a + " plus " + b + " equals " + (a + b) + ".");

        scanner.close();
    }

    private static int getInput(Scanner scanner, char var) {

        int input;

        System.out.print("Input number for variable " + var + ": ");

        while(true) {
            if(scanner.hasNextInt()) {
                input = scanner.nextInt();
                break;
            } else {
                System.out.println("Not a number! Try again");
                scanner.nextLine();
            }
        }

        return input;
    }

}