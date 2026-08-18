class Solution:
    def countSubstrings(self, s: str) -> int:
        def counter(l, r, s):
            count = 0
            while l >= 0 and r <= len(s)-1 and s[l] == s[r]:
                l -= 1
                r += 1
                count += 1
            return count

        res = 0
        for i in range(len(s)):
            res += counter(i, i, s)
            res += counter(i, i+1 , s)
        return res