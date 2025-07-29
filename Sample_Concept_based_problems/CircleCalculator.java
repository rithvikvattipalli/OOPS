package week1;
import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        final double PI = 3.14159;  
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();     
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;  
        System.out.println("\n--- Circle Calculations ---");
        System.out.printf("Radius        : %.2f%n", radius);
        System.out.printf("Area          : %.4f%n", area);
        System.out.printf("Circumference : %.4f%n", circumference);

        scanner.close();
    }
}
