import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hexNum = scanner.next();
        int deciamlNum = Integer.parseInt(hexNum, 16);
        for(int i = 1; i < 16; i++) {
            System.out.println(hexNum+"*"+ Integer.toHexString(i).toUpperCase() +"=" + Integer.toHexString (deciamlNum * i ).toUpperCase());
        }
    }
}
