package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class CopyComplexLinkedList {
	

		    public RandomListNode Clone(RandomListNode pHead) {
		        if(pHead == null) {
		            return null;
		        }	         
		        RandomListNode currentNode = pHead;
		        //1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
		        while(currentNode != null){
		            RandomListNode cloneNode = new RandomListNode(currentNode.label);
		            RandomListNode nextNode = currentNode.next;
		            currentNode.next = cloneNode;
		            cloneNode.next = nextNode;
		            currentNode = nextNode;
		        }
				        currentNode = pHead;
		        //2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
		        while(currentNode != null) {
		            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
		            currentNode = currentNode.next.next;
		        }
		         
		        //3、拆分链表，将链表拆分为原链表和复制后的链表
		        currentNode = pHead;
		        RandomListNode pCloneHead = pHead.next;
		        while(currentNode != null) {
		            RandomListNode cloneNode = currentNode.next;
		            currentNode.next = cloneNode.next;
		            cloneNode.next = cloneNode.next==null?null:cloneNode.next.next;
		            currentNode = currentNode.next;
		        }
		         
		        return pCloneHead;
		    }
	 
	 

	public static void main(String[] args) {
		//1,2,3,4,5,3,5,#,2,#
		RandomListNode headNode=new RandomListNode(1);
		RandomListNode temp=headNode;
		System.out.println(temp.label);
		temp.next=new RandomListNode(2);
		temp=temp.next;
		System.out.println(temp.label);
		temp.next=new RandomListNode(3);
		temp=temp.next;
		System.out.println(temp.label);
		temp.next=new RandomListNode(4);
		temp=temp.next;
		System.out.println(temp.label);
		temp.next=new RandomListNode(5);
		temp=temp.next;
		System.out.println(temp.label);
		temp.next=new RandomListNode(3);
		temp=temp.next;
		System.out.println(temp.label);
		temp.next=new RandomListNode(5);
		temp=temp.next;
		System.out.println(temp.label);
     	headNode.random=headNode.next.next;
     	System.out.println(temp);
     	System.out.println(headNode.next.next);
		CopyComplexLinkedList complexLinkedList=new CopyComplexLinkedList();
		RandomListNode cloneHeadNode=complexLinkedList.Clone(headNode);
		RandomListNode tp=cloneHeadNode;
		while(tp!=null){
		System.out.println(tp.label);
		tp=tp.next;
		}
	}

}
