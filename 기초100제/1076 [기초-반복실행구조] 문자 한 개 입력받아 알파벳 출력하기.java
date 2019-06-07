import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next();
        for(int i = 97; i<=alphabet.getBytes()[0]; i++) {
            System.out.print((char)i + " ");
        }
    }
}

