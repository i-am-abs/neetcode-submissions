/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (!mergeIntervalsChecker(intervals)) {
            return false;
        }
        return true;
    }

    private static boolean mergeIntervalsChecker(List<Interval> intervals) {
        int n = intervals.size();
        intervals.sort(Comparator.comparingInt(a -> a.start));
        List<int[]> ans = new ArrayList<>();

        if (intervals == null || intervals.size() <= 1) {
            return true;
        }

        int end = intervals.get(0).end;

        for (int i = 1; i < n; i++) {
            int currentStart = intervals.get(i).start;
            int currentEnd = intervals.get(i).end;
            if (currentStart < end) {
                return false;
            }
            end = currentEnd;
        }
        return true;
    }
}
