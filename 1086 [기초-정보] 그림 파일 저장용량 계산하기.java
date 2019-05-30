import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        double mb = Math.round(w * h * b * 100.0 / 8 / 1024 / 1024) / 100.0;
        System.out.println(mb + " MB");
    }
}
