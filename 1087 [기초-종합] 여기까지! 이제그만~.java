import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNum = scanner.nextInt();
        int number = 1;
        while (true) {
            if (number * (number + 1) > 2 * sumNum) {
                System.out.println(number * (number + 1) / 2);
                break;
            }
            number++;
        }
    }
}
