import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int sumOfMPow = 0;
        for (int i = n - 2; i >= 0; i--)
            sumOfMPow += Math.pow(m, i);
        int result = (int) (a * Math.pow(m, n - 1) + d * sumOfMPow);
        System.out.println(result);
    }
}
