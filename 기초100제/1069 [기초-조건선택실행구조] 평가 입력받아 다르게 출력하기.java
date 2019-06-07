import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        switch (grade.toUpperCase()) {
            case "D":
                System.out.println("slowly~");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "A":
                System.out.println("best!!!");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}

