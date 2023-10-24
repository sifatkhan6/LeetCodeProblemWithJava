import java.util.Scanner;

public class LengthofLastWord {
	public int lengthOfLastWord(String s) {
        // Remove trailing and leading spaces
        s = s.trim();
        
        int length = 0;
        
        // Start from the end of the string
        for (int i = s.length() - 1; i >= 0; i--) {
            // Continue counting characters until a space is encountered
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                // Break when a space is encountered, indicating the last word has ended
                break;
            }
        }
        
        return length;
    }
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        LengthofLastWord solution = new LengthofLastWord();
	        int length = solution.lengthOfLastWord(input);

	        System.out.println("Length of the last word: " + length);
	    }
}
