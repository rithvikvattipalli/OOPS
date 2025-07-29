package week1;
import java.util.Scanner;
public class StudentDetails {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Entre Student Name:-");
	String name=s.nextLine();
	System.out.println("Entre the roll number:-");
	int roll=s.nextInt();
	System.out.println("Entre the gender:-");
	char gender=s.next().charAt(0);
	System.out.println("Entre the persentage:-");
	float percentage=s.nextFloat();
	System.out.println("---Student Details---");
	System.out.println("Name:-"+name);
	System.out.println("Roll No:-"+roll);
	System.out.println("Gender:-"+gender);
	System.out.println("Persentage:-"+percentage);
	
	
	
	
	
}

}
