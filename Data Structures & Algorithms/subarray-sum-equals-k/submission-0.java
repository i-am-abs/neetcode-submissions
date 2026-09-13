class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int totalSum = 0;
        int count = 0;
        Map<Integer, Integer>map = new HashMap<>();
        map.put(0, 1);

        for(int i=0; i<n; i++) {
            totalSum+=nums[i];

            if(map.containsKey(totalSum - k)) {
                count = count + map.get(totalSum - k);
            }
            map.put(totalSum, map.getOrDefault(totalSum, 0) + 1);
        }
        return count;
    }
}
