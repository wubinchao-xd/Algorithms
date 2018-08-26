package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class VerifySquenceOfBST {
	 public  boolean VerifySquenceOfBinaySearchT(int[] sequence) {
		int len=sequence.length;
		if(sequence==null)
			return false;
		return isBST(sequence, 0, len-1);
	}

	 public boolean isBST(int[] sequence,int left,int right){
		 if(left==right||(right-left)==1)
			 return true;
		 int root=sequence[right];
		 int i=left;
		 while(sequence[i]<root&&i<right){
			 i++;
		 }
		 int j=i;
		 for(;i<right;i++){
			 if(sequence[i]<root)
				 return false;
		 }
		 return isBST(sequence,left,j-1)&&isBST(sequence,j,right-1);
	 }
	 

	public static void main(String[] args) {
		int []a={3,5,4,7,8,6,11,15,9,12,10};
		VerifySquenceOfBST verifySquenceOfBST=new VerifySquenceOfBST();
		System.out.println(verifySquenceOfBST.VerifySquenceOfBinaySearchT(a));

	}

}
