class myStack {

    private int[] arr;
    private int idx;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
        idx = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(idx == -1) return true;
        else return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(idx == arr.length - 1) return true;
        else return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(isFull()) return;
        idx++;
        arr[idx] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(idx == -1) return;
        arr[idx] = 0;
        idx--;
    }

    public int peek() {
        // Returns the top element of the stack
        if(idx == -1) return -1;
        return arr[idx];
    }
}