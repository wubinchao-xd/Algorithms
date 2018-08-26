package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */

public class FindKthToTail {

    public static ListNode FindKthToTailSolution(ListNode head,int k) {
    	 if(head==null||k<=0)
      	   return head;
    	 ListNode first=head;
    	 ListNode second=head;
           for(int i=1;i<k;i++){
        	   if(first.next!=null)
        	     first=first.next;
        	   else 
        		   return null;
           }
           while(first.next!=null){
        	   first=first.next;
        	   second=second.next;
           }
          
           return second;
	    }

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		ListNode target=FindKthToTailSolution(null,1);
		if(target!=null)
		System.out.println(target.val);
		else
			System.out.println(target);
	}
		

}
