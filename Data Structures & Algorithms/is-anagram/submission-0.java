class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        int [] frequencyArray = new int[26];

        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<n; i++){
            frequencyArray[s.charAt(i)-'a']++;
        }
        for(int i=0; i<m; i++) {
            frequencyArray[t.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++) {
            if(frequencyArray[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
