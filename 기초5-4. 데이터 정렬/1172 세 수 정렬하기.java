import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strNumber = scanner.nextLine().split(" ");
        int[] numbers = new int[strNumber.length];
        for (int i = 0; i < strNumber.length; i++) {
            numbers[i] = Integer.parseInt(strNumber[i]);
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = numbers.length -1; j>i; j--) {
                if(numbers[j] < numbers[j-1]) {
                    swap(numbers, j, j-1);
                }
            }
        }

        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int[] numbers, int j, int i) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
