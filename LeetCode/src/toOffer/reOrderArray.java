package toOffer;
/**
 * @ClassName: 
 * @Description:����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
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
