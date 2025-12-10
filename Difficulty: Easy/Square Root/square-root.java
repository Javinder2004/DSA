class Solution {
    int floorSqrt(int n) {
        // code here
         int ans=0;
       
       for(int i=1;i*i<=n;i++){
           ans=i;
       }
       return ans;
    }
}