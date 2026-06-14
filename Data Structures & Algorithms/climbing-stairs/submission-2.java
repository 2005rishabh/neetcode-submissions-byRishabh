public class Solution {
    public int climbStairs(int n) {
        // int[] dpp =  new int[n];
        // Arrays.fill(dpp, -1);
        // return dfs(n, 0, dpp);

        if(n <= 2) return n;
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // public int dfsTD(int n, int i, int[] dp) {
    //     if (i >= n) return i == n ? 1 : 0;
    //     if(dp[i] != -1) return dp[i];
    //     return dp[i] = dfs(n, i + 1, dp) + dfs(n, i + 2, dp);
    // }



}