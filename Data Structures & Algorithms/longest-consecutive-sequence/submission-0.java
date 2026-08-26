class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        Set<Integer>set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(nums[i]);
        }

        for(int i=0; i<n; i++) {
            if(!set.contains(nums[i]-1)) {
                int currentElement = nums[i];
                int currentLength = 0;
                while(set.contains(currentElement)) {
                    currentElement++;
                    currentLength++;
                }
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }
}
