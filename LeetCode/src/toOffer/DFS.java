package toOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */


//    1
// 2    3
//4  5  6  7
public class DFS {
	public static ArrayList<Integer> DFS(TreeNode root) {
	     if(root==null)
	    	 return null;
	     Stack<TreeNode> stack=new Stack<TreeNode>();
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
	        stack.add(root);
	        while(!stack.isEmpty()){
	        	TreeNode node=stack.pop();
	        	arrayList.add(node.val);	
	        	if(node.right!=null)
	        	stack.add(node.right);
	        	if(node.left!=null)
	        	stack.add(node.left);
	        }
	        return arrayList;
	        
	    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		 root.right=new TreeNode(3);
		 root.left.left=new TreeNode(4);
		 root.left.right=new TreeNode(5);
		 root.right.left=new TreeNode(6);
		 root.right.right=new TreeNode(7);
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 arrayList= DFS(root);
//		 arrayList= PrintFromTopToBottom(null);
		 System.out.println(arrayList.toString());
		
	}

}
