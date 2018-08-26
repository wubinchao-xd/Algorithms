package toOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class BFS {

	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	     if(root==null)
	    	 return null;
	     Queue<TreeNode> queue=new LinkedList<TreeNode>();
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
	        queue.add(root);
	        while(!queue.isEmpty()){
	        	TreeNode node=queue.poll();
	        	arrayList.add(node.val);
	        	if(node.left!=null)
	        	queue.add(node.left);
	        	if(node.right!=null)
	        	queue.add(node.right);
	        }
	        return arrayList;
	        
	    }
//    1
// 2    3
//4 5  6  7
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		 root.right=new TreeNode(3);
		 root.left.left=new TreeNode(4);
		 root.left.right=new TreeNode(5);
		 root.right.left=new TreeNode(6);
		 root.right.right=new TreeNode(7);
		 ArrayList<Integer> arrayList=new ArrayList<Integer>();
		 arrayList= PrintFromTopToBottom(root);
//		 arrayList= PrintFromTopToBottom(null);
		 System.out.println(arrayList.toString());
		
	}

}
