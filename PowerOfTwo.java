//231. Power of Two - Easy
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
	    if (n <= 0) {
	        return false;
	    }
	    return (n & (n - 1)) == 0;
	}
	public static void main(String[] args) {
		PowerOfTwo solution = new PowerOfTwo();
        
        int[] testCases = {1, 16, 3, 1024, 0, -8};
        
        for (int num : testCases) {
            boolean result = solution.isPowerOfTwo(num);
            System.out.println(num + " is a power of two: " + result);
        }
    }
}
