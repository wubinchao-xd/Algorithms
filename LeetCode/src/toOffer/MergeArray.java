/**
 * 
 */
package toOffer;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author WuBinChao
 *2018��8��24��
 * ����3:44:15
 * 
 * ��Javaʵ��һ������, �����������������������ƴ�ӳ�һ���µ���������, �����ظ�����. 
int[] arrayA = {1, 3, 4, 12, 55, 56, 71, 81}; 
int[] arrayB = {2, 12, 13�� 19, 32, 55, 57, 100};

 */
public class MergeArray {
	
	
	
	public static void main(String[] args) {
		int[] arrayA = {1,3,4,12,55,56,71,81}; 
		int[] arrayB = {2,12,13,19,32,55,57,100};
        int len=arrayA.length+arrayB.length;
	    int[]arrayC=new int[len];
	      fun(arrayA,arrayB,arrayC);
	      System.out.println(Arrays.toString(arrayC));
//	     for(int i=0;i<len;i++){
//	    	 System.out.println(arrayC[i]);
//	     }
}
 public static void fun(int[] a,int[] b,int[]c){
	
	
	 int pointA=0;
	 int pointB=0;
	 int pointC=0;
	 while(pointA<a.length&&pointB<b.length){
		 if(a[pointA]<b[pointB])
			 c[pointC++]=a[pointA++];
		 else{
			 c[pointC++]=b[pointB++];
		 }
			 
	 }
//	 while(pointA<a.length){
//		 c[pointC++]=a[pointA++];
//	 }
//
//	 while(pointB<a.length){
//		 c[pointC++]=b[pointB++];
//	 }
	 if(pointA==a.length){
		 for(int i=pointB;i<b.length;i++)
			 c[pointC++]=b[pointB++];
		 
	 }
     else {
    	 for(int i=pointA;i<a.length;i++)
			 c[pointC++]=a[pointA++];
	}
 }
}
