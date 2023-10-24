//Problem No: 27. Remove Element - Easy
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
	    int n = nums.length;
	    int left = 0;

	    for (int right = 0; right < n; right++) {
	        if (nums[right] != val) {
	            nums[left] = nums[right];
	            left++;
	        }
	    }

	    return left;
	}
	public static void main(String[] args) {
		RemoveElement solution = new RemoveElement();
	    int[] nums = {3, 2, 2, 3, 3, 4, 5, 6};
	    int val = 5;

	    int newLength = solution.removeElement(nums, val);

	    System.out.println("Modified Array:");
	    for (int i = 0; i < newLength; i++) {
	        System.out.print(nums[i] + " ");
	    }
	    System.out.println("\nNew Length: " + newLength);
	}
}
