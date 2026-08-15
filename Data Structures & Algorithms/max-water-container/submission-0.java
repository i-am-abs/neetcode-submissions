class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int start = 0;
        int end = n - 1;
        int maxWater = 0;

        while (start < end) {
            int width = end - start;
            int minHeight = Math.min(heights[start], heights[end]);
            int area = width * minHeight;
            
            maxWater = Math.max(maxWater, area);
            if (heights[start] > heights[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxWater;
    }
}
