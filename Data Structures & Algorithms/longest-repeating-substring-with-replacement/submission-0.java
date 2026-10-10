class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] frequency = new int[26];
        int left = 0;
        int maxFrequency = 0;
        int answer = 0;

        for (int right = 0; right < n; right++) {
            frequency[s.charAt(right) - 'A']++;
            maxFrequency = Math.max(maxFrequency, frequency[s.charAt(right) - 'A']);
            int replacements = (Math.abs(right - left + 1)) - maxFrequency;
            while (replacements > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
                replacements = (Math.abs(right - left + 1)) - maxFrequency;
            }
            answer = Math.max(answer, Math.abs(right - left + 1));
        }
        return answer;
    }
}
