class MinStack {


    Stack<Long> stack ;
    long minval;

    public MinStack() {
        stack=new Stack<>();
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push((long) val);
            minval=val;
        }else if(val>=minval){
                stack.push((long) val);
            }
        else{
            stack.push(2L * val -minval);
            minval=val;
        }
        
    }
    
    public void pop() {
        long top=stack.pop();
        if(top<minval){
            minval=2*minval-top;
        }
        
    }
    
    public int top() {
        long top = stack.peek();
        if (top < minval)
            return (int) minval;
        return (int) top;
        
    }
    
    public int getMin() {
        return (int) minval;
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