class myStack {
    private Stack<Integer> st;
    public myStack() {
        st = new Stack<>();
    }
     public void push(int x) {
        st.push(x);
    }

    
    public void pop() {
        if (!st.isEmpty()) {
            st.pop();
        }
    }
    public int peek() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        
        return -1; 
    }

    public int getSize() {
        return st.size();
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }
}