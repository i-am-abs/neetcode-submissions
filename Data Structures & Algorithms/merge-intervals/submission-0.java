class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int m = intervals[0].length;

        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < n; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            } else {
                ans.add(new int[] {start, end});
                start = currentStart;
                end = currentEnd;
            }
        }
        
        ans.add(new int[] {start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}
