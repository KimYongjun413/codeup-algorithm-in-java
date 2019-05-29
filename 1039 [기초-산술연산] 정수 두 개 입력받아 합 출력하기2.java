import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strCleftNumber = scanner.nextLine().split(" ");
        long result = 0;
        for(String str : strCleftNumber)
            result += Integer.parseInt(str);
        System.out.println(result);
    }
}

