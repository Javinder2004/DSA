class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> List = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean isLeader = true;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    isLeader = false;
                    break;
                }
            }
                 if(isLeader == true){
                     List.add(arr[i]);
                }
            
        }
                     return List;
    }
}
