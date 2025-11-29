// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for(int i = 0; i < arr.length; i++){
            res.add(arr[i]);
        }
        ArrayList<Integer> res1 = new ArrayList<>();
        res1.addAll(res);
        return res1;
    }
}