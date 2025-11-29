class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0L;

        for (int x : arr) {
            actualSum += x;
        }

        long missing = expectedSum - actualSum;
        return (int) missing;
    }
}