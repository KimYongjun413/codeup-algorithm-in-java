import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rDensity = scanner.nextInt();
        int gDensity = scanner.nextInt();
        int bDensity = scanner.nextInt();
        int count = 0;
        for(int r = 0; r < rDensity; r ++) {
            for(int g = 0; g < gDensity; g ++) {
                for(int b = 0; b < bDensity; b ++) {
                    count++;
                    System.out.println(r + " " + g + " "+ b);
                }
            }
        }
        System.out.println(count);
    }
}
