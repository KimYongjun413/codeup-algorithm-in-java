import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.println((num[0] > num[1] ? num[1] : num[0]) > num[2] ? num[2] : (num[0] > num[1] ? num[1] : num[0]));
    }
}

