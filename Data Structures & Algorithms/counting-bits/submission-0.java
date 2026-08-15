class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countBitsOfN(i);
        }
        return ans;
    }

    private static int countBitsOfN(int n) {
        int count = 0;
        while (n != 0) {
            count = count + n % 2;
            n = n / 2;
        }
        return count;
    }
}
