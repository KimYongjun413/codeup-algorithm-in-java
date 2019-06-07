import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n = 1;
        while (true) {
            if(n * (n + 1) >= 2 * number) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
