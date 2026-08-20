class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        if((nums.length == 0) || ((nums.length == 1) && (nums[0] == val))){
            return 0;
        }

        while(i <= j) {
            if(nums[j] == val) {
                j--;
            } else if(nums[i] != val) {
                i++;
            } else {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];  
        arr[index1] = arr[index2]; 
        arr[index2] = temp;    
    }
}