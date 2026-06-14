class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp =  new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(dfs(0, cost, dp), dfs(1, cost, dp));
    }
    int dfs(int i, int[] c, int[] dp) {
        if(i >= c.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = c[i] + Math.min(dfs(i+1, c, dp), dfs(i+2, c, dp));
    }   
}
