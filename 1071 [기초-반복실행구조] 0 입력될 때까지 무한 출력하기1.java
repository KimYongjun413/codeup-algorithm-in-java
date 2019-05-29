import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while(true) {
            num = scanner.nextInt();
            System.out.println(num);
            if(num == 0) break;
        }
    }
}

