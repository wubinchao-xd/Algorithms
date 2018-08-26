package toOffer;

import java.util.Stack;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class TwoStackToQueue {
	
	    Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	        stack1.push(node);
	    }
	    
	    public int pop() {
	    	int result=0;
	    if(!stack2.empty()){
	    	Integer a=stack2.pop();
	    	 result=a.intValue();
	       }
	    else{
	    	while(!stack1.empty()){
	    	  stack2.push(stack1.pop())	;
	    	 
	    	}
	    	 Integer a=stack2.pop();
	    	 result=a.intValue();
	    }
	    return result;
	    }
	}
