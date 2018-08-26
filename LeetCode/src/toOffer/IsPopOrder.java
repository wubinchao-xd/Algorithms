package toOffer;

import java.util.Stack;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class IsPopOrder {
	public static boolean isPopOrder(int [] pushA,int [] popA) {
		if(pushA.length!=popA.length)
			  return false;
	      int len=popA.length;
	      Stack<Integer> stack=new Stack<Integer>();
	      int indexPop=0;
	      for(int i=0;i<len;i++){
	    	  stack.push(pushA[i]);
	    	  while(!stack.empty()&&popA[indexPop]==stack.peek()){
			        indexPop++;
			         stack.pop();
		               }
	      }
	      return stack.isEmpty();
		
	}
	
	 public static boolean doPopOrder(int [] pushA,int [] popA) {
		  if(pushA.length!=popA.length)
			  return false;
	      int len=popA.length;
	      Stack<Integer> stack=new Stack<Integer>();
	      int indexPush=0;
	      int indexPop=0;
	      while(pushA[indexPush]!=popA[indexPop]){
	    	  stack.push(pushA[indexPush]);
	    		  indexPush++;
	    		  if(indexPush>=len)
	    			  return false;
	      }
	      indexPop++;
	      
	    while(indexPush<len-1){
	    	
	            if(!stack.empty()&&popA[indexPop]==stack.peek()){
		        indexPop++;
		         stack.pop();
	               }
	          else{
	        	  indexPush++;
	        	  stack.push(pushA[indexPush]);
	            }
	            
	    }
	    while(!stack.isEmpty()){
	    	if(stack.peek()==popA[indexPop]){
	    		stack.pop();
	    		indexPop++;
	    	}
	    	else
	    		return false;
	    }
	    return true;
	 }

	public static void main(String[] args) {
		int push[]={1,2,3,4,5};
		int popA[]={4,5,3,2,1};
		int popB[]={4,3,5,1,2};
		System.out.println(isPopOrder(push, popA));
		System.out.println(isPopOrder(push, popB));
		

	}

}
