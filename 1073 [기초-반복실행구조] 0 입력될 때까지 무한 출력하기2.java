import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList();
        int num;
        while(true) {
            num = scanner.nextInt();
            numbers.add(num);
            System.out.println(num);
            if(num == 0) break;
        }
    }
}

