class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ch = new int[256];
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)]++;
            ch[t.charAt(i)]--;
        }
        for(int i = 0 ; i < 256; i++) {
            if( ch[i] != 0) return false;
        }
        return true;
    }
}