// Вывести все простые числа от 1 до 1000

public class task1_1 {
    public static void main(String[] args) {
        int n = 1000;

        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
