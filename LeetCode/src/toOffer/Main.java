package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String string=in.nextLine();
    	String string="abcdefghijklmnop";
        int n=string.length();
        int k=n/4;
        char[] c= new char[n];
        c=string.toCharArray();
        
        //System.out.println(c);
        for(int i=0;i<=k;i++){
        	System.out.print(c[i]);
        	
        }
        System.out.println();
        for(int i=1;i<k;i++){
        	System.out.print(c[n-i]);
        	for(int j=1;j<k;j++)
        		System.out.print(" ");
        	System.out.print(c[k+i]);
        			System.out.println();		
        }
        for(int i=3*k;i>=2*k;i--){
        	System.out.print(c[i]);
        	
        }
        
    }
}
