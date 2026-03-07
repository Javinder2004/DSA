class Solution {
    static int noOfWays(int m, int n, int x) {
        // code here
        long[] prev = new long[x + 1];
        prev[0] = 1;
        for (int i = 1; i <= n; i++) {
            long[] curr = new long[x + 1];
            long windowSum = 0;
            for (int j = 1; j <= x; j++) {
                windowSum = (windowSum + prev[j - 1]);
                if (j > m) {
                    windowSum = (windowSum - prev[j - m - 1]);
                }
                curr[j] = windowSum;
            }
        prev = curr;
        }
        return (int) prev[x];
    }
}