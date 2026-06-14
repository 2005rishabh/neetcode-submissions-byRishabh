class Solution {
    public int rob(int[] cost) {
        // int[] dp =  new int[cost.length];
        // Arrays.fill(dp, -1);
        // return Math.max(dfs(0, cost, dp), dfs(1, cost, dp));
        if (cost == null || cost.length == 0) return 0;
        if (cost.length == 1) return cost[0];

        int n = cost.length;
        int[] dp = new int[n];

        dp[0] = cost[0]; 
        dp[1] = Math.max(cost[0], cost[1]); 
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + cost[i]);
        }

        return dp[n - 1];
    }


    // int dfs(int i, int[] c, int[] dp) {
    //     if(i >= c.length) return 0;
    //     if(dp[i] != -1) return dp[i];
    //     return dp[i] = c[i] + Math.max(dfs(i+2, c, dp), dfs(i+3, c, dp));
    // }   
}
