class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        Arrays.sort(coins);
        int res =  dfs(coins.length - 1, coins, amount, 0);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    int dfs(int i, int[] c, int a, int count) {
        if(a  == 0) return count;
        if(i < 0 || a < 0) return Integer.MAX_VALUE;
        return Math.min(dfs(i, c, a - c[i], count + 1), dfs(i-1, c, a, count));
    }
}
