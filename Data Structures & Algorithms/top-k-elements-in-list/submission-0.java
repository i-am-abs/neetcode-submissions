class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            priorityQueue.offer(entry);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = priorityQueue.poll().getKey();
        }
        return result;
    }
}
