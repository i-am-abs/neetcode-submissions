class Solution {
    public int climbStairs(int n) {
        int twoStepsBefore = 1;
        int oneStepBefore = 1;

        if (n <= 1) {
            return 1;
        }
        
        for(int i=2; i<=n; i++) {
            int currentIdx = twoStepsBefore + oneStepBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = currentIdx;
        }
        return oneStepBefore;
    }
}
