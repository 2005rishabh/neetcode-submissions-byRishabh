class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int[] left = new int[n];
        left[0] = h[0];
        int right[] = new int[n];
        right[n-1] = h[n-1];
        for(int i = 1 ; i  <n; i++) {
            left[i] = Math.max(h[i], left[i-1]);
        }
        for(int i=n-2; i >=0; i--) {
            right[i] = Math.max(right[i+1], h[i]);
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int s = Math.min(left[i], right[i]) - h[i];
            if(s != 0) ans += s;
        }
        return ans;
    }
}
