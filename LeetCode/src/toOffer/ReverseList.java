package toOffer;


/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class ReverseList {

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		ListNode h=ReverseListSolution(head);
		if(h==null)
			System.out.println("error");
		else{
			while(h.next!=null){
		System.out.println(h.val);
		h=h.next;
		}
		System.out.println(h.val);
		}

	}
	 public static ListNode ReverseListSolution(ListNode head) {
		 if(head==null||head.next==null)
	           return head;
	         ListNode indexPerio=head;
	        ListNode index=indexPerio.next;
	       if(head.next.next==null){
	    	   indexPerio.next=null;
	            index.next=indexPerio;
	             return index;
	        }
	        else{
	        ListNode indexAfter=index.next;
	        indexPerio.next=null;
	        while(indexAfter.next!=null){
	            index.next=indexPerio;
	            indexPerio=index;
	            index=indexAfter;
	            indexAfter=indexAfter.next;
	        }
	            index.next=indexPerio;
	            indexAfter.next=index;
	        return indexAfter;
	        }
	
    }
}
