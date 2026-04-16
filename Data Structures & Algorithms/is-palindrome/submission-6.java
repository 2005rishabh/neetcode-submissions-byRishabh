class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while(l<r) {
            char chl = s.charAt(l);
            char chr = s.charAt(r);
            if(!Character.isLetterOrDigit(chl)) l++;
            else if(!Character.isLetterOrDigit(chr)) r--;
            else {
                if(Character.toLowerCase(chl) != Character.toLowerCase(chr)) return false;
                l++;
                r--;
            } 
        }
        return true;
    }
}
