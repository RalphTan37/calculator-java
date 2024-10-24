import java.util.Scanner;
import java.util.List;

public class Calculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperations operations = new ArithmeticOperations();
        PreAlgebra prealgebra = new PreAlgebra();

        System.out.println("Welcome to the Calculator App!");
        System.out.println("What would you like to calculate today?");
        System.out.println("[1] Basic Math\n[2] PreAlgebra");

        String input = scanner.nextLine();

        if (input.equals("Basic Math")){
            System.out.println("Please Enter Arithmetic Operation Preference:");
            System.out.println("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\n[5] Modulo");
            String operation = scanner.nextLine();

            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            switch (operation){
                case "Addition":
                    System.out.printf("%.2f + %.2f = %.2f", number1, number2, operations.add(number1, number2));
                    break;
                case "Subtraction":
                    System.out.printf("%.2f - %.2f = %.2f", number1, number2, operations.subtract(number1, number2));
                    break;
                case "Multiplication":
                    System.out.printf("%.2f * %.2f = %.2f", number1, number2, operations.multiply(number1,number2));
                    break;
                case "Division":
                    if (number2 == 0){
                        System.out.println("Can not divide by zero.");
                    } else{
                        System.out.printf("%.2f / %.2f = %.2f", number1, number2, operations.divide(number1, number2));
                    }
                    break;
                case "Modulo":
                    System.out.printf("%.2f %% %.2f = %.2f", number1, number2, operations.modulo(number1, number2));
                    break;
                default:
                    System.out.printf("%s is not a supported operation.", operation);
            }
        } else if (input.equals("PreAlgebra")){
            System.out.println("Please Enter Method Preference:");
            System.out.println("[1] Prime Factorization\n[2] Greatest Common Factor\n[3] Least Common Multiple");
            String method = scanner.nextLine();

            switch (method) {
                case "Prime Factorization":
                    System.out.println("Enter a number: ");
                    int number = scanner.nextInt();
                    List<Integer> factors = PreAlgebra.primeFactorization(number);
                    System.out.println("Prime Factorization of " + number + ": " + factors);
                    break;
                case "Greatest Common Factor":
                    System.out.println("Enter the first number: ");
                    int number1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the second number: ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    int gcfResult = PreAlgebra.gcf(number1, number2);
                    System.out.println("GCF of " + number1 + " and " + number2 + ": " + gcfResult );
                    break;
                case "Least Common Multiple":
                    System.out.println("Enter the first number: ");
                    int number3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the second number: ");
                    int number4 = scanner.nextInt();
                    int lcmResult = PreAlgebra.lcm(number3, number4);
                    System.out.println("LCM of " + number3 + " and " + number4 + ": " + lcmResult);
                    break;
                default:
                    System.out.println(method + " is not supported.");
                    break;
            }
        } else {
            System.out.println("Please enter a valid option.");
        }

        scanner.close();
    }
}


