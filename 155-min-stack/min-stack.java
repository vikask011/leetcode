class MinStack {

    static class pair{
        int value;
        int min;
    

    pair(int value,int min){
        this.value=value;
        this.min=min;
    }}

    private Stack<pair> stack;



    public MinStack() {
        stack = new Stack<>();
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new pair(val,val));
        }else{
            stack.push(new pair(val,Math.min(val,stack.peek().min)));
        }
    }
    
    public void pop() {
         stack.pop();
        
    }
    
    public int top() {
        return stack.peek().value;
        
    }
    
    public int getMin() {
        return stack.peek().min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */