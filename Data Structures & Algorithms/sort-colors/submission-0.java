class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int mid = 0;
        int end = n-1;

        while(mid <= end) {
            if(nums[mid] == 2) {
                swapElements(nums, mid, end);
                end--;
            } else if(nums[mid] == 0) {
                swapElements(nums, mid, start);
                start++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private static void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}