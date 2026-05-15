class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        int profit = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                profit = Math.max(profit, (p[j] - p[i]));
            }
        }
        return profit;
    }
}
