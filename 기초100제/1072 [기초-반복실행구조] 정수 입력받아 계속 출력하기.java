import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for(int i=0; i<length; i++)
            numbers[i] = scanner.nextInt();
        for(int num : numbers)
            System.out.println(num);

    }
}

