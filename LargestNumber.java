//179. Largest Number - Medium
import java.util.Arrays;

public class LargestNumber {
	 public String largestNumber(int[] nums) {
	        // Convert the integers to strings so we can perform string comparison.
	        String[] numStrs = new String[nums.length];
	        for (int i = 0; i < nums.length; i++) {
	            numStrs[i] = String.valueOf(nums[i]);
	        }

	        // Custom comparator to compare strings based on their concatenated values.
	        Arrays.sort(numStrs, (a, b) -> (b + a).compareTo(a + b));

	        // Handle cases where the array consists of only zeros.
	        if (numStrs[0].equals("0")) {
	            return "0";
	        }

	        // Concatenate the sorted strings to form the largest number.
	        StringBuilder result = new StringBuilder();
	        for (String numStr : numStrs) {
	            result.append(numStr);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        LargestNumber solution = new LargestNumber();
	        int[] nums = {3, 30, 34, 5, 9};
	        String largestNum = solution.largestNumber(nums);
	        System.out.println("Largest Number: " + largestNum);
	    }
}
