class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for(int i=0; i<n; i++) {
            if(count == 0) {
                element = nums[i];
                count = 1;
            } else if(nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        int countOfElement = 0;
        for(int i=0; i<n; i++) {
            if(nums[i] == element) {
                countOfElement++;
            }
        }
        if(countOfElement > n/2) {
            return element;
        }
        return -1;
    }
}