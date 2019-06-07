import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] cleftTime = date.split("\\.");
        System.out.println(cleftTime[2] + "-" + cleftTime[1] + "-" + cleftTime[0]);
    }
}
