import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[19][19];
        for (int r = 0; r < 19; r++) {
            for (int c = 0; c < 19; c++) {
                board[r][c] = scanner.nextInt();
            }
        }
        int stoneCnt = scanner.nextInt();
        int stonePoint[][] = new int[stoneCnt][2];
        for (int s = 0; s < stoneCnt; s++) {
            stonePoint[s][0] = scanner.nextInt();
            stonePoint[s][1] = scanner.nextInt();
        }

        for (int x = 0; x < stoneCnt; x++) {
            for (int y = 0; y < 19; y++) {
                board[stonePoint[x][0] - 1][y] = board[stonePoint[x][0] - 1][y] == 0 ? 1 : 0;
                board[y][stonePoint[x][1] - 1] = board[y][stonePoint[x][1] - 1] == 0 ? 1 : 0;
            }
        }

        for (int r = 0; r < 19; r++) {
            for (int c = 0; c < 19; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
}

