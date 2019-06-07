import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int s = scanner.nextInt();
        double mb = Math.round(h * b * s * c * 10.0 / 8 / 1024 / 1024) / 10.0;
        System.out.println(mb + " MB");        
    }
}
