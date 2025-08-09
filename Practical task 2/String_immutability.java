package practicaltask2;

public class String_immutability {

		    public static void main(String[] args) {
		        String s1 = "Forecast";

		        // Try to change the string by concatenation
		        s1.concat(" AI");

		        // Original string remains unchanged
		        System.out.println("After concat (without reassignment): " + s1);

		        // Reassign to modify
		        s1 = s1.concat(" AI");
		        System.out.println("After concat (with reassignment): " + s1);
		    }
		}

