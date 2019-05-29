import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] cleftNumber = number.split("\\.");
        System.out.println(cleftNumber[0]);
        System.out.println(cleftNumber[1]);
    }
}
