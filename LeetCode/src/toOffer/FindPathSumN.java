package toOffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

import org.omg.CORBA.RepositoryIdHelper;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class FindPathSumN {
	
	
public static ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target) {
	ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<ArrayList<Integer>>();
	Stack<Integer>stack=new Stack<Integer>();
	int currentSum=0;
	findPathSumN(root,arrayLists,target,stack,currentSum);
	return arrayLists;
    }
public static void findPathSumN(TreeNode root,ArrayList<ArrayList<Integer>> arrayLists,int target,Stack<Integer> stack,int currentSum) {
	if(root==null||arrayLists==null||stack==null)
		return;
	stack.push(root.val);
	currentSum=currentSum+root.val;
	if(root.left==null&&root.right==null&&currentSum==target){
		ArrayList<Integer> arrayList=new ArrayList<>();
       for(Integer i:stack){
    	   arrayList.add(i);
       }
       arrayLists.add(arrayList);        	 
	}
	if(root.left!=null)
		findPathSumN(root.left,arrayLists,target,stack,currentSum);
	if(root.right!=null)
		findPathSumN(root.right,arrayLists,target,stack,currentSum);
	stack.pop();
}

	public static void main(String[] args) {
		TreeNode root=new TreeNode(10);
		root.left=new TreeNode(5);
		 root.right=new TreeNode(12);
		 root.left.left=new TreeNode(4);
		 root.left.right=new TreeNode(7); 
		 ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<ArrayList<Integer>>();
		 arrayLists=findPath(root,22);
		 for(ArrayList<Integer> arrayList:arrayLists)
			 System.out.println(arrayList.toString());
		 
	}

}
