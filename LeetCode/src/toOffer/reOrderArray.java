package toOffer;
/**
 * @ClassName: 
 * @Description:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author: 
 * @date: 
 */
public class reOrderArray {
	
	public static void main(String[] args) {
		reOrderArray re=new reOrderArray();
		int [] array={1,2,3,4,5,6,7,8};
		re.reOrderArraySolution(array);
		int n=array.length;
		for(int i=0;i<n;i++){
		System.out.print(array[i]);
		}
	}
	public void reOrderArraySolution(int [] array) {
        int n=array.length;
        int [] result=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
        	if((array[i]&1)==1)
        		result[k++]=array[i];
        }
        for(int i=0;i<n;i++){
        	if((array[i]&1)==0)
        		result[k++]=array[i];
        }
        for(int i=0;i<n;i++){
        	array[i]=result[i];
        }
    }

}
