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
		        //1������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A���棻
		        while(currentNode != null){
		            RandomListNode cloneNode = new RandomListNode(currentNode.label);
		            RandomListNode nextNode = currentNode.next;
		            currentNode.next = cloneNode;
		            cloneNode.next = nextNode;
		            currentNode = nextNode;
		        }
				        currentNode = pHead;
		        //2�����±������������Ͻ������ָ����½�㣬��A1.random = A.random.next;
		        while(currentNode != null) {
		            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
		            currentNode = currentNode.next.next;
		        }
		         
		        //3�����������������Ϊԭ����͸��ƺ������
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
