import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intBool = scanner.nextInt();
        int result = intBool == 1 ? 0 : 1;
        System.out.println(result);
    }
}
