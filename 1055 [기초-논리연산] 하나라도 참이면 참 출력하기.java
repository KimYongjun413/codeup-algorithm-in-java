﻿import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intBoolA = scanner.nextInt();
        int intBoolB = scanner.nextInt();
        if( intBoolA == 1 || intBoolB == 1)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
