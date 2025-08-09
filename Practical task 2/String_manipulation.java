package practicaltask2;

public class String_manipulation {
	    public static void main(String[] args) {
	        String original = "Smart Energy";

	        System.out.println("Original: " + original);

	        // Convert to uppercase
	        System.out.println("Uppercase: " + original.toUpperCase());

	        // Convert to lowercase
	        System.out.println("Lowercase: " + original.toLowerCase());

	        // Replace characters
	        System.out.println("Replace 'Energy' with 'Assistant': " + original.replace("Energy", "Assistant"));

	        // Substring
	        System.out.println("Substring (0 to 5): " + original.substring(0, 5));

	        // Check if string contains a word
	        System.out.println("Contains 'Smart'? " + original.contains("Smart"));

	        // Split the string
	        String[] parts = original.split(" ");
	        System.out.println("Split words:");
	        for (String part : parts) {
	            System.out.println(part);
	        }
	    }
	}
