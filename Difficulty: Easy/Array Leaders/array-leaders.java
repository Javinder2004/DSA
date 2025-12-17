class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length-1]; 
        result.add(max);
        for(int i=arr.length-1; i > 0; i--){
           if ((arr[i] <= arr[i-1]) && (arr[i-1] >= max)) {
               max = arr[i-1];
               result.add(max);
           } 
        }
        Collections.reverse(result);
        return result;
    }
}