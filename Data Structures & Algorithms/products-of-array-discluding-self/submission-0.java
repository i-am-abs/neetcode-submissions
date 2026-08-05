class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int[] prefixMultiply = new int[n];
        int[] suffixMultiply = new int[n];
        prefixMultiply[0] = nums[0];
        suffixMultiply[n - 1] = nums[n - 1];

        for (int i = 1; i < n; i++) {
            prefixMultiply[i] = prefixMultiply[i - 1] * nums[i];
        }

        for (int i = n - 2; i >= 0; i--) {
            suffixMultiply[i] = suffixMultiply[i + 1] * nums[i];
        }

        answer[0] = suffixMultiply[1];
        answer[n - 1] = prefixMultiply[n - 2];

        for (int i = 1; i < n - 1; i++) {
            answer[i] = prefixMultiply[i - 1] * suffixMultiply[i + 1];
        }
        return answer;
    }
}
