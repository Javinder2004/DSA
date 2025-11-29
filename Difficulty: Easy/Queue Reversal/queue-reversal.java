class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
         int size = q.size();
         Stack <Integer> st = new Stack<>();
         while(size!=0){
             st.push(q.remove());
             size--;
         }
         size=st.size();
         while(size!=0){
             q.add(st.pop());
             size--;
         }
    }
}