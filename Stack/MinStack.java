/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 */

class MinStack {
    Stack<Node> minStack;
    class Node{
        Integer val;
        Integer minVal;
        
        Node(Integer val, Integer minVal){
            this.val = val;
            this.minVal = minVal;
        }
    }

    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<Node>();
    }
    
    public void push(int x) {
        if(minStack.isEmpty()){
            Node node = new Node(x,x);
            minStack.push(node);
            return;
        }
        Node node = minStack.peek();
        Node newNode = new Node(x,Math.min(node.minVal,x));
        minStack.push(newNode);
    }
    
    public void pop() {
        if(minStack.isEmpty())
            return ;
        minStack.pop();
    }
    
    public int top() {
        if(!minStack.isEmpty()){
            Node node = minStack.peek();
            return node.val;
        }
        return Integer.MAX_VALUE;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            Node node = minStack.peek();
            return node.minVal;
        }
        return Integer.MAX_VALUE;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
