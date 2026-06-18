class MinStack {

    Stack<Integer> stack;
    Stack<Integer> mins = new Stack<>();;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {

        if(!this.stack.isEmpty()){
            min = Math.min(mins.peek(),val);     
            this.stack.push(val);
            this.mins.push(min); 
        } else{
            this.stack.push(val);
            this.mins.push(val);
        }
    }
    
    public void pop() {
        this.stack.pop();
        this.mins.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.mins.peek();
    }
}
