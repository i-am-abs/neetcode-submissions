class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] lastSeen = new int[128];
        Arrays.fill(lastSeen, -1);
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < n; right++) {
            if (lastSeen[s.charAt(right)] >= left) {
                left = lastSeen[s.charAt(right)] + 1;
            }
            lastSeen[s.charAt(right)] = right;
            int len = right - left + 1;
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}