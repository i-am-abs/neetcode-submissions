class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = getTotalSum(nums);
        int minimumSum = minimumSumKadaneAlgorithm(nums);
        int maximumSum = maximumSumKadaneAlgorithm(nums);
        int circularSum = totalSum - minimumSum;
        if (maximumSum > 0) {
            return Math.max(maximumSum, circularSum);
        }
        return maximumSum;
    }

    private static int getTotalSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    private static int minimumSumKadaneAlgorithm(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            currSum = currSum + nums[i];
            minSum = Math.min(currSum, minSum);
            if (currSum > 0) {
                currSum = 0;
            }
        }
        return minSum;
    }

    private static int maximumSumKadaneAlgorithm(int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}