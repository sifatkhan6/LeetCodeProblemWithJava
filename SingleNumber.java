//Problem No: 136. Single Number - Easy
public class SingleNumber {
	public int singleNumber(int[] nums) {
	    int result = 0;
	    for (int num : nums) {
	        result ^= num;
	    }
	    return result;
	}
	public static void main(String[] args) {
		SingleNumber solution = new SingleNumber();
	    int[] nums = {4, 1, 2, 1, 2};
	    int result = solution.singleNumber(nums);
	    System.out.println("The single number is: " + result);
	}
}
