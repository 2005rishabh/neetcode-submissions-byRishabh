class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=  t.length;
        int[] r = new int[n];
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(t[j] > t[i]) {
                    r[i] = j-i;
                    break;
                }
            }
        }
        return r;
    }
}
