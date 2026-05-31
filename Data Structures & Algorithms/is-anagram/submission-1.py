class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        n = len(s)
        m = len(t)
        frequency_array = [0] * 26
        if n != m:
            return False
        for i in range(n):
            frequency_array[ord(s[i]) - ord('a')] = frequency_array[ord(s[i]) - ord('a')] + 1
        for i in range(m):
            frequency_array[ord(t[i]) - ord('a')] = frequency_array[ord(t[i]) - ord('a')] - 1
        for i in range(26):
            if frequency_array[i] != 0:
                return False
        return True