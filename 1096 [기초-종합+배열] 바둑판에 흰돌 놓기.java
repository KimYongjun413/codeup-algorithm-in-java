import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[19][19];
        int stoneCnt = scanner.nextInt();
        int[][] stone = new int[stoneCnt][2];

        for (int i = 0; i < stoneCnt; i++) {
            stone[i][0] = scanner.nextInt();
            stone[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < stoneCnt; i++) {
            board[stone[i][0] - 1][stone[i][1] - 1] = 1;
        }

        for (int r = 0; r < 19; r++) {
            for (int c = 0; c < 19; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}
