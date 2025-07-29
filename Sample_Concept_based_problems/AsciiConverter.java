package week1;

import java.util.Scanner;
public class AsciiConverter {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("Please enter exactly one character.");
        } else {
            char ch = input.charAt(0); 
            int asciiValue = (int) ch; 
            System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
            System.out.println("Integer representation: " + asciiValue);
        }

        scanner.close();
    }

}
