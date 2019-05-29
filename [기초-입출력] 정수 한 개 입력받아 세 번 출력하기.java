import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 3 ; i ++)  {
            result.append(number.toString()).append(" ");
        }
        System.out.println(result.substring(0, result.length()-1));
    }
}
