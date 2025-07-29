package week1;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int leftShiftA = a << 1;
        int rightShiftA = a >> 1;
        System.out.println("\n--- Bitwise Operations ---");
        System.out.printf("a        = %d (%s)%n", a, Integer.toBinaryString(a));
        System.out.printf("b        = %d (%s)%n", b, Integer.toBinaryString(b));
        System.out.printf("a & b    = %d (%s)%n", andResult, Integer.toBinaryString(andResult));
        System.out.printf("a | b    = %d (%s)%n", orResult, Integer.toBinaryString(orResult));
        System.out.printf("a ^ b    = %d (%s)%n", xorResult, Integer.toBinaryString(xorResult));
        System.out.printf("a << 1   = %d (%s)%n", leftShiftA, Integer.toBinaryString(leftShiftA));
        System.out.printf("a >> 1   = %d (%s)%n", rightShiftA, Integer.toBinaryString(rightShiftA));

        scanner.close();
    }
}