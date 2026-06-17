class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (!isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (!isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (toLowerCase(s.charAt(start)) != toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    private boolean isLetterOrDigit(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
    }

    private char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + ('a' - 'A'));
        }
        return ch;
    }
}
