package linkedin._070_Climbing_Stairs;

/**
 * @author jacka
 * @version 1.0 on 8/4/2019
 */
public final class SolutionII implements Solution {
  @Override
  public int climbStairs(int n) {
    if (n <= 0) {
      return 0;
    }
    final int[] dp = new int[n + 1];
    dp[0] = 1;
    dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}
