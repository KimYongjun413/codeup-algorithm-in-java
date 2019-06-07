import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] word = scanner.next().getBytes();
        word[0] += 1;
        System.out.println((char)word[0]);
    }
}

