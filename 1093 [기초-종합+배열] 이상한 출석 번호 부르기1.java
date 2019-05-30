import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idx = scanner.nextInt();
        int[] calledStdNo = new int[idx];
        int[] stdNo = new int[23];
        for(int i=0; i<idx; i++) {
            calledStdNo[i] = scanner.nextInt();
            stdNo[calledStdNo[i]-1]++;
        }
        for(int n : stdNo)
            System.out.print(n + " ");
    }
}
