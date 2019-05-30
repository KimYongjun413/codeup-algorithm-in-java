import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mazeBoard = new int[10][10];
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                mazeBoard[r][c] = scanner.nextInt();
            }
        }

        Ant ant = new Ant(1, 1);
        for (int c = 1; c < 10; c++) {
            if(ant.isEat()) break;
            if (mazeBoard[ant.getX()][c] == 0) {
                mazeBoard[ant.getX()][c] = 9;
                ant.setY(c);
            }
            else if (mazeBoard[ant.getX()][c] ==2) {
                mazeBoard[ant.getX()][c] = 9;
                ant.setEat(true);
                break;
            }

            if (c < 8 && mazeBoard[ant.getX()][c + 1] == 0) {
                continue;
            }

            ant.setX(ant.getX() + 1);
            for (int r = ant.getX(); r < 10; r++) {
                if (mazeBoard[r][ant.getY()] == 0) {
                    mazeBoard[r][ant.getY()] = 9;
                    ant.setX(r);
                } else if (mazeBoard[r][ant.getY()] == 2) {
                    mazeBoard[r][ant.getY()] = 9;
                    ant.setEat(true);
                    break;
                }
                if (ant.getY() < 9 && mazeBoard[r][ant.getY() + 1] == 0) break;
                else if (r + 1 < 10 && mazeBoard[r + 1][ant.getY()] == 0) continue;
            }
        }

        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(mazeBoard[r][c] + " ");
            }
            System.out.println();
        }
    }

    private static class Ant {
        private int x;
        private int y;
        private boolean isEat;

        public boolean isEat() {
            return this.isEat;
        }

        public void setEat(boolean eat) {
            isEat = eat;
        }

        public Ant(int x, int y) {
            this.x = x;
            this.y = y;
            this.isEat = false;
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



