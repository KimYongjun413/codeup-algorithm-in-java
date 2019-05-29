import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        String[] cleftRegNo = regNo.split("-");
        System.out.println(cleftRegNo[0] + cleftRegNo[1]);
    }
}
