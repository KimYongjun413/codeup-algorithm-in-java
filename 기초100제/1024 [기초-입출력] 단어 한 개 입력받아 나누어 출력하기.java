import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for(int i = 0; i<word.length(); i++)
            System.out.println("'"+word.charAt(i)+"'");
    }
}
