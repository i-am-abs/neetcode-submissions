class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n-1;

        while(start <= end) {
            swapElements(s, start, end);
            start++;
            end--;
        }
    }

    private static void swapElements(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}