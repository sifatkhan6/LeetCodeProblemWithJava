//29. Divide Two Integers - Medium
public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        long quotient = 0;
        while (ldividend >= ldivisor) {
            long temp = ldivisor;
            long multiple = 1;
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            ldividend -= temp;
            quotient += multiple;
        }

        return (int)(sign * quotient);
    }
	public static void main(String[] args) {
		DivideTwoIntegers solution = new DivideTwoIntegers();

	    // Test cases
	    int dividend1 = 10;
	    int divisor1 = 3;
	    int result1 = solution.divide(dividend1, divisor1);
	    System.out.println("Result 1: " + result1); // Expected output: 3

	    int dividend2 = 7;
	    int divisor2 = -3;
	    int result2 = solution.divide(dividend2, divisor2);
	    System.out.println("Result 2: " + result2); // Expected output: -2

	    int dividend3 = Integer.MIN_VALUE;
	    int divisor3 = -1;
	    int result3 = solution.divide(dividend3, divisor3);
	    System.out.println("Result 3: " + result3);
	}
}
