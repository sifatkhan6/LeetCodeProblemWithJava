//322. Coin Change - Medium
import java.util.Arrays;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int coin : coins) {
        for (int i = coin; i <= amount; i++) {
            dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
    }

    return dp[amount] > amount ? -1 : dp[amount];
    }
	public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        
        CoinChange solution = new CoinChange();
        int minCoins = solution.coinChange(coins, amount);
        
        System.out.println("Minimum number of coins to make up " + amount + " is: " + minCoins);
    }
}
