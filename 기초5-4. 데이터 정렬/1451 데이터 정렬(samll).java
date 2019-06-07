import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumberCount = scanner.nextInt();
        int[] numbers = new int[inputNumberCount];

        for(int i=0; i< numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {
            for(int j = numbers.length -1; j>i; j--) {
                if(numbers[j] < numbers[j-1]) {
                    swap(numbers, j, j-1);
                }
            }
        }

        for(int num : numbers) {
            System.out.println(num);
        }
    }

    public static void swap(int[] numbers, int j, int i) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
