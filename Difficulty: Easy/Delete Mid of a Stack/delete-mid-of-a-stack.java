class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        int mid = n/2;
        int i=0;
        
        delete(s,mid,i);
        
        }
      public void delete(Stack<Integer> s,int mid , int i){
          if(mid == i){
              s.pop();
          }
          else{

              int top = s.pop();
              delete(s,mid,i+1);
              s.push(top);
          }
    }
}