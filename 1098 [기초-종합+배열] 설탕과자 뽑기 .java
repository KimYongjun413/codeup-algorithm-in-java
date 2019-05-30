import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, w, n;
        h = scanner.nextInt();
        w = scanner.nextInt();
        int[][] board = new int[h][w];
        n = scanner.nextInt();
        Stick[] sticks = new Stick[n];

        for (int cnt = 0; cnt < n; cnt++) {
            sticks[cnt] = new Stick();
            sticks[cnt].setI(scanner.nextInt());
            sticks[cnt].setD(scanner.nextInt());
            sticks[cnt].setX(scanner.nextInt());
            sticks[cnt].setY(scanner.nextInt());
        }

        for (int cnt = 0; cnt < n; cnt++) {
            if (sticks[cnt].getD() == 0) {
                for (int len = sticks[cnt].getY() - 1; len < sticks[cnt].getY() + sticks[cnt].getI() -1; len++) {
                    board[sticks[cnt].getX() - 1][len] = 1;
                }
            } else {
                for (int len = sticks[cnt].getX() - 1; len < sticks[cnt].getX() + sticks[cnt].getI() - 1; len++) {
                    board[len][sticks[cnt].getY()-1] = 1;
                }
            }

        }

        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

    }

    public static class Stick {
        private int i;
        private int d;
        private int x;
        private int y;

        public Stick() {
            this.i = 0;
            this.d = 0;
            this.x = 0;
            this.y = 0;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}



