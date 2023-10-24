//Problem No: 1.Two Sum - Easy
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{map.get(complement), i};
            }
            
            // Otherwise, put the current number and its index into the HashMap
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}