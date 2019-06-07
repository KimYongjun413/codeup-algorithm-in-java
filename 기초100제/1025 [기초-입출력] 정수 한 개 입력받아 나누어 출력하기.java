import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int idx = 0;
        int pow = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.println("[" + Integer.parseInt(String.valueOf(number.charAt(idx++))) * (int) Math.pow(10, i) + "]");
        }
    }
}
