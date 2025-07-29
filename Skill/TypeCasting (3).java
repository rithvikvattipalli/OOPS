package week1;
import java.util.Scanner;
public class TypeCasting {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:-");
		double d=s.nextDouble();
		int i;
		i=(int)d;
		System.out.println("Double value:"+d);
		System.out.println("Integer value after casting:"+i);
	}

}
