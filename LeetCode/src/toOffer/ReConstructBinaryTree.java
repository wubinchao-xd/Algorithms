package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class ReConstructBinaryTree {

	
	 public  static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre==null||in==null) 
	        	return null;	
	        int length=pre.length;
	        if(length==0) return null;
	        TreeNode head=new TreeNode(pre[0]);
	        if (length==1) return head;
	        int index=0;
	        while(pre[0]!=in[index]){
	        	index++;
	        }
	        int [] p_pre=new int[index];
	        int [] p_aft=new int[length-index-1];
	        int[] in_pre=new int[index];
	        int[] in_aft=new int[length-index-1];
	        for(int i=0;i<index;i++){
	        	p_pre[i]=pre[i+1];
	        	in_pre[i]=in[i];
	        }
	        for(int i=0,j=index;i<length-index-1;i++){
	        	      j++;
	        	p_aft[i]=pre[j];
	        	in_aft[i]=in[j];
	        }
	        head.left=reConstructBinaryTree(p_pre,in_pre);
	        head.right=reConstructBinaryTree(p_aft,in_aft);
	        return head;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  int[] pre={1,2,3,-1,5,6,7}; 
//		  int[] in={3,2,4,1,6,5,7};
		  
		  int[] pre ={1,2,4,3,5,6};
		  int[] in={4,2,1,5,3,6};
		  TreeNode head=reConstructBinaryTree(pre,in);
		  System.out.println(head.val);
		  System.out.println(head.left.val);
		  System.out.println(head.right.val);
		  System.out.println(head.left.left.val);
		  System.out.println(head.left.right.val);
		  System.out.println(head.right.left.val);
		  System.out.println(head.right.right.val);
		  
	}

}
