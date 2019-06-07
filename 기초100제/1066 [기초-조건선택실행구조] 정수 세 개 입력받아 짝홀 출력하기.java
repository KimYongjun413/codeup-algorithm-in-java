import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        for(int num : nums ) {
            if(num % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}

