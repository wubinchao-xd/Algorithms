/**
 * 
 */
package toOffer;

/**
 * @author WuBinChao
 *2018年8月23日
 * 下午9:27:59
 */
public class SubArrayMaxSum {
    public  static int FindGreatestSumOfSubArray(int[] array) {
        int sum=0;
        int len=array.length;
        int max=0;
        int maxNumber=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
        	if(array[i]>maxNumber)
        		maxNumber=array[i];
        	sum=sum+array[i];
        	if(sum<0) sum=0;
        	if(sum>max)max=sum;
        }
        if(maxNumber<0)
        	return maxNumber;
        return max;
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]a={-1,2,-3,-1,4,6,-7};
         System.out.println(FindGreatestSumOfSubArray(a));
	}

}
