import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNumbers = scanner.nextLine().split(" ");
        int[] numbers = new int[strNumbers.length];
        int sum = 0;
        for (String str : strNumbers)
            sum += Integer.parseInt(str);
        System.out.println(sum);
        System.out.println(Math.round((double)sum / numbers.length * 10.0) / 10.0);
    }
}

