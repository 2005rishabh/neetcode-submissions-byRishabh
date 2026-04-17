class Solution {
    public int maxArea(int[] h) {
        int area  = 0;
        int maxA = 0;
        int n = h.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                area = Math.min(h[i], h[j]) * Math.abs(i-j);
                maxA = Math.max(area, maxA);
            }
        }
        return maxA;
    }
}
