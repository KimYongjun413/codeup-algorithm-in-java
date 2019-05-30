import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) System.out.print("X ");
            else System.out.print(i + " ");
        }
    }
}
