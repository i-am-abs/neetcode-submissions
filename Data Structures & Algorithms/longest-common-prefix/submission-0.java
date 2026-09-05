class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String result = strs[0];
        for (int i = 1; i < n; i++) {
            if (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                i--;
            }

            if (i == n - 1 && !strs[i].startsWith(result)) {
                return "";
            }
        }
        return result;
    }
}
