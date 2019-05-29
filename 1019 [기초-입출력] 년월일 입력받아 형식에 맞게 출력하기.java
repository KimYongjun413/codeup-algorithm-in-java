import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String[] cleftDate = inputDate.split("\\.");
        int year = Integer.parseInt(cleftDate[0]);
        int month = Integer.parseInt(cleftDate[1]) - 1;
        int date = Integer.parseInt(cleftDate[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(year,month,date);
        System.out.printf("%1$tY.%1$tm.%1$td", cal);
    }
}
