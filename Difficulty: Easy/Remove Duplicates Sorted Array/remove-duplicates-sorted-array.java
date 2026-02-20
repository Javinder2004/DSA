class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if (arr.length == 0) return result;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                result.add(arr[i]);
            }
        }
        // Add the last element
        result.add(arr[arr.length - 1]);
        return result;
    }
}
