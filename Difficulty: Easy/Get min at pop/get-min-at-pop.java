class GetMin {
    public static Stack<Integer> _push(int arr[], int n) {
        // code here
         Stack<Integer> st=new Stack<>();
     int min=Integer.MAX_VALUE;
     for(int i=0;i<arr.length;i++){
         if(arr[i]<min){
             min=arr[i];
         }
         st.push(min);
     }
     
     return st;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        while(!s.isEmpty()) {
          System.out.print(s.pop()+" ");
       }
        // code here
    }
}