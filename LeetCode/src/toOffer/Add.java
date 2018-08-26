package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class Add {

	public static void main(String[] args) {
		 int[] b={ 1,2,3,2,4,2,5,2,3};
		 quickSort(b, 0, b.length-1);
		 for(int i=0;i<b.length;i++)
	            System.out.print(b[i]);
          
	}
	
	public static void quickSort(int[]a,int start,int end){
		if(a==null||start>=end)
			return;
		int key=a[start];
		int i=start;
		int j=end;
		while(i<j){
			while(i<j&&a[j]>=key){	
				j--;		
			}
			a[i]=a[j];
			while(i<j&&a[i]<=key){	
				i++;		
			}
		  a[j]=a[i];				
	
		}
		a[i]=key;
		quickSort(a, start, i-1);
		quickSort(a, i+1, end);
	}

}
