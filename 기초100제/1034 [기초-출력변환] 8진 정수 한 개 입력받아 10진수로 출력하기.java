import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octal = scanner.next();
        int decimal = Integer.parseInt(octal,8);
        System.out.println(decimal);
    }
}

