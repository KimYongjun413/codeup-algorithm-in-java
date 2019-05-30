import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String alphabet = scanner.next();
            System.out.println(alphabet);
            if(alphabet.equals("q")) break;
        }
    }
}
