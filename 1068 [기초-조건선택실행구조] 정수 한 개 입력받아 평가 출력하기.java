import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num <= 100 && num >=90) System.out.println("A");
        else if(num <= 89 && num >=70) System.out.println("B");
        else if(num <= 69 && num >=40) System.out.println("C");
        else System.out.println("D");
    }
}

