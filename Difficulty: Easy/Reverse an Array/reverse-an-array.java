class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int len = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-i];
            arr[len-i] = temp;
        }
    }
}