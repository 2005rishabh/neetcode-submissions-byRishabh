class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Frequency of s1 and first window of s2
        for (int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check first window
        if (matches(count1, count2)) return true;

        // Sliding window
        for (int i = n; i < m; i++) {
            count2[s2.charAt(i) - 'a']++;           // add new char
            count2[s2.charAt(i - n) - 'a']--;       // remove old char

            if (matches(count1, count2)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}