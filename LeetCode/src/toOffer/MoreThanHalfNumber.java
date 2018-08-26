package toOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class MoreThanHalfNumber {
	
	
	 public static int MoreThanHalfNum_Solution(int [] array) {
	            int n=array.length;
	            QuickSort(array,0,n-1);
	            for(int i=0;i<n;i++)
	            System.out.print(array[i]);
	            int t=array[n/2];
	            int left=0;
	            int right=0;
	            for(int i=0;i<n;i++){
	                if(array[i]==t){
	                    left=i;
	                    break ;
	                    }
	            }
	            for(int i=n-1;i>0;i--){
	                if(array[i]==t){
	                    right=i;
	                   break;
	                }
	            }
	            int number=right-left+1;
	            System.out.println(number);
	            if(number>=n/2){
	            	 System.out.print("中间数是"+t);
	            return t;
	            }
	            return 0;
	                 
	        }
	       
	     public static void QuickSort(int [] array,int low,int hight){
	    	 if(low>=hight)
	    		 return;
	    	 int left=low;
	    	 int right=hight;
	    	 int key=array[low];
	    	 while(low<hight){
	    		 while(low<hight&&array[hight]>=key){
	    			 hight--;
	    		 }
	    		 array[low]=array[hight];
	    		 while(low<hight&&array[low]<=key){
	    			 low++;
	    		 }
	    		 array[hight]=array[low];
	    		 
	    	 }
	    	 array[low]=key;
	    	 QuickSort(array, left, low-1);
	    	 QuickSort(array, low+1, right);
	    	 
	     }
	        public static void QuickSort(int [] array){
	        	if(array==null)
	        		return ;
	             int n=array.length;
	             int key=0;
	             int invo=array[0];
	             int left=0;
	             int right=n-1;
	              while(left<right){
	            	  while(array[right]>array[key])
	            		  right--;
	            	  int temp=0;
	            	  temp=array[right];
	            	 array[right]=array[key];
	            	 array[key]=temp;
	            	 key=right;
	            	 while(array[left]<array[key])
	            		 left++;
	            	 temp=array[left];
	            	 array[left]=array[key];
	            	 array[key]=temp;
	            	  key=left;
	              }
	              int [] array1=new int[left+1];
	              for(int i=0;i<=left;i++)
	            	  array1[i]=array[i];
	              QuickSort(array1);
                  if(left<n-1){
	              int [] array2=new int[n-left-2];
	              for(int i=left+1;i<n;i++)
	            	  array2[i]=array[i];
	              QuickSort(array2);
	              }
	                       
           
	              
	        }

	public static void main(String[] args) {
		     int[] array={1,2,3,2,2,2,5,4,2};
		     int[] b={ 1,2,3,2,4,2,5,2,3};
		     int[] c={ 5,4,6,7,2,1};
		    MoreThanHalfNum_Solution(b);
	}

}
