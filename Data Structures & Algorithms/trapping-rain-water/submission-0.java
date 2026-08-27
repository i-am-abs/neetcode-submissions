class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        int start = 0;
        int end = n-1;
        while(start < end) {
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);
            if(leftMax < rightMax) {
                ans = ans + (leftMax - height[start]);
                start++;
            } else {
                ans = ans + (rightMax - height[end]);
                end--;
            }
        }
        return ans;
    }
}
