package week1;
import java.util.Scanner;
public class DataWidening {
public static void main(String[]args) {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the Number:-");
    int n=s.nextInt();
    long l=n;
    float f=n;
    System.out.println("long value after casting= "+l);
    System.out.println("float value after casting= "+f);
    
    
}
}
