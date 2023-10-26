//41. First Missing Positive - Hard

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int n = nums.length;

    for (int i = 0; i < n; i++) {
        while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
            int temp = nums[i];
            nums[i] = nums[temp - 1];
            nums[temp - 1] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        if (nums[i] != i + 1) {
            return i + 1;
        }
    }
    return n + 1;
    }
	public static void main(String[] args) {
		FirstMissingPositive solution = new FirstMissingPositive();
	    int[] nums = {3, 4, -1, 1};
	    int result = solution.firstMissingPositive(nums);
	    System.out.println("The first missing positive integer is: " + result);
	}
}
