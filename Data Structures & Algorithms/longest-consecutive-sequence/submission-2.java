class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr) set.add(num);
        int maxL = 0;

        for(int n : set) {
            if(!set.contains(n-1)) {
                int l = 1;
                while(set.contains(n + l)) {
                    l++;
                }
                maxL = Math.max(maxL, l);
            }
        }

        return maxL;
    }
}
