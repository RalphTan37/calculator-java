import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App!");
        System.out.println("What would you like to calculate today?");
        System.out.println("[1] Arithmetic Operations");

        String input = scanner.nextLine();

        if (!input.equals("Arithmetic Operations")){
            System.out.println("Please enter of the valid options.");
        } else {
            System.out.println("Please Enter Arithmetic Operation Preference:");
            System.out.println("[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division");
            String operation = scanner.nextLine();

            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();

            switch (operation){
                case "Addition":
                    System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 + number2);
                    break;
                case "Subtraction":
                    System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
                    break;
                case "Multiplication":
                    System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                    break;
                case "Division":
                    if (number2 == 0){
                        System.out.println("Can not divide by zero.");
                    } else{
                        System.out.printf("%.2f / %.2f = %.2f", number1, number2, number1 / number2);
                    }
                    break;
                default:
                    System.out.printf("%s is not a supported operation.", operation);
            }
        }

        scanner.close();
    }
}


