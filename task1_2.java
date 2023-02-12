// Калькулятор

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Error! operator is not correct");
                return;
            }
        }
        System.out.println("Result: " + result);
    }
}
