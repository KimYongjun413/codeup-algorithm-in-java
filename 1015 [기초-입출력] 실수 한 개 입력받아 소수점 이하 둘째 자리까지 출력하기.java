import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = Math.round(scanner.nextFloat() * 100);
        System.out.println(number /= 100);
    }
}
