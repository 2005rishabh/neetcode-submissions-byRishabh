class Solution {
    public int rob(int[] nums) {
        // Handle base cases safely
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0]; 

        int n = nums.length;
        
        // Scenario 1: Rob houses 0 to n-2
        // We need a dedicated dp array filled with -1
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        // Pass n - 1 as the exclusive boundary (stops before n - 1)
        int maxExcludingLast = dfs(0, n - 1, nums, dp1);
        
        // Scenario 2: Rob houses 1 to n-1
        // We need a SECOND dedicated dp array
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        // Pass n as the exclusive boundary (stops before n)
        int maxExcludingFirst = dfs(1, n, nums, dp2);

        return Math.max(maxExcludingLast, maxExcludingFirst);
    }

    // Cleaned up signature: (current_index, exclusive_end_index, nums, dp)
    private int dfs(int i, int end, int[] nums, int[] dp) {
        // If we hit or pass our boundary, return 0
        if (i >= end) return 0;
        
        // Return cached result if available
        if (dp[i] != -1) return dp[i];

        // Standard logic: Max of (Rob current + skip next) OR (Skip current)
        int robCurrent = nums[i] + dfs(i + 2, end, nums, dp);
        int skipCurrent = dfs(i + 1, end, nums, dp);

        // Cache and return
        return dp[i] = Math.max(robCurrent, skipCurrent);
    }
}
