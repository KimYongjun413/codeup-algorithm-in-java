import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();
        String[] cleftTime = time.split(":");
        System.out.println(cleftTime[1]);
    }
}
