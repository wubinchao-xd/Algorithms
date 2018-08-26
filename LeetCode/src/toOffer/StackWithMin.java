package toOffer;

import java.util.Stack;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class StackWithMin {
	     private int min=Integer.MAX_VALUE;
	     Stack<Integer> stack=new Stack<Integer>();
	     Stack<Integer> stackmin=new Stack<Integer>();
	    public void push(int node) {
	    	stack.push(node);  
	    	if(node<min)
	    		min=node;
	    	stackmin.push(min);
	    }
	    
	    public void pop() {
	        stack.pop();
	        stackmin.pop();
	    }
	    
	    public int top() {
	    	return stack.peek();
	    }
	    
	    public int min() {
	        return stackmin.peek();
	    }

	public static void main(String[] args) {
		StackWithMin stackWithMin=new StackWithMin();
		stackWithMin.push(3);
		System.out.println(stackWithMin.min());
		stackWithMin.push(4);
     	System.out.println(stackWithMin.min());
		stackWithMin.push(2);
		System.out.println(stackWithMin.min());
		stackWithMin.push(3);
		System.out.println(stackWithMin.min());
		stackWithMin.pop();
		System.out.println(stackWithMin.min());
		stackWithMin.pop();
		System.out.println(stackWithMin.min());
	}

}
//["PSH3","MIN","PSH4","MIN","PSH2","MIN","PSH3","MIN","POP","MIN","POP","MIN","POP","MIN","PSH0","MIN"]