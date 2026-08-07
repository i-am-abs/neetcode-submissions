class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character>set = new HashSet<>();
        int j = 0;
        int maxLength = 0;
        for(int i=0; i<n; i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                maxLength = Math.max(maxLength, Math.abs(i-j+1));
            } else {
                while(s.charAt(j) != s.charAt(i)) {
                    set.remove(s.charAt(j));
                    j++;
                }
                set.remove(s.charAt(j));
                j++;
                set.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}