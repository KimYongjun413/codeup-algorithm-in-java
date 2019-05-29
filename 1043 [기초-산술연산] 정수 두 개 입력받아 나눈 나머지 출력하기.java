import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNumbers = scanner.nextLine().split(" ");
        int[] numbers = new int[strNumbers.length];
        int idx = 0;
        for(String str : strNumbers)
            numbers[idx++] = Integer.parseInt(str);
        System.out.println(numbers[0] % numbers[1]);
    }
}

