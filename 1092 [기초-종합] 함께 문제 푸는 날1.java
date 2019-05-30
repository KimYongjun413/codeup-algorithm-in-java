import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int date = 1;
        while(true) {
            if(!(date % a == 0 && date % b == 0 && date % c == 0)) date++;
            else {
                System.out.println(date);
                break;
            }
        }
    }
}
