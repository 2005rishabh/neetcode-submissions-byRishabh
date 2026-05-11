public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        while (l <= r) {
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return l;
    }
}