// Натуральные числа и их произведение


import java.util.Scanner;

public class task1_0 {
    //    Lesson 1 - Task 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int result = 0;
        int result1 = 1;
        for (int i = 0; i <= N; i++) {
            result += i;
        }
        for (int i = 1; i <= N; i++) {
            result1 *= i;
        }
        System.out.println(result + " - n-ое треугольное число" + "\n" + result1 + " - произведение чисел от 1 до n");
    }
}