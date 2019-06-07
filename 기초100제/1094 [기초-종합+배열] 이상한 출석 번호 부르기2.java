import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = scanner.nextInt();
        int[] calledStdNo = new int[idx];
        for (int i = 0; i < idx; i++) {
            calledStdNo[i] = scanner.nextInt();
        }
        for (int i = calledStdNo.length - 1; i >= 0; i--)
            System.out.print(calledStdNo[i] + " ");
    }
}
