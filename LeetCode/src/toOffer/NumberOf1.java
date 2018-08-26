package toOffer;

import java.util.Scanner;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class NumberOf1 {
	 public int getNumberOf1(int n) {
	        int count=0;
	        int temp=1;
	     while(temp>0){
	        if((n & temp)!=0)
	         count++;
	         temp=temp<<1;
	     }
	        return count;
	    }
	 
	 public static void main(String[] args) {
		 NumberOf1 num=new NumberOf1();
		 Scanner sc=new Scanner(System.in);
		 while(true){
		 int n=sc.nextInt();
	     System.out.println(num.getNumberOf1(n));
		 }
		}
}
