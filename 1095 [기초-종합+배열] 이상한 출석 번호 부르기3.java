import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = scanner.nextInt();
        int[] calledStdNo = new int[idx];
        calledStdNo[0] = scanner.nextInt();
        int minNo = calledStdNo[0];
        int cnt = 1;
        do {
            calledStdNo[cnt] = scanner.nextInt();
            if (minNo > calledStdNo[cnt]) minNo = calledStdNo[cnt];
            cnt++;
        } while (cnt != idx);
        System.out.println(minNo);
    }
}
