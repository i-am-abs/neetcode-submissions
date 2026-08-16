class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(') {
                stack.push(chars[i]);
            } else {
                if (!stack.isEmpty()) {
                    if ((chars[i] == '}' && stack.peek() == '{')
                        || (chars[i] == ')' && stack.peek() == '(')
                        || (chars[i] == ']' && stack.peek() == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
