package toOffer;

import java.util.Scanner;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class powerOfDouble {
	 public static boolean erroFlag=false;
	    public double Power(double base, int exponent) {
	        double result=0.0;
	        erroFlag=false;
	        if(equal(base,0.0)&&exponent<=0){
	           erroFlag=true;
	            return 0.0;
	        }
	       result=pow(base,exponent);
	        return result;            
	  }
	    public boolean equal(double a,double b){
	        if(Math.abs(a-b)<0.0000001)
	            return true;
	        else return false;
	    }
	     public double pow(double a,int n){
	    	 int absN=Math.abs(n);
	    	 double temp=1;
	         for(int i=0;i<absN;i++){
	        	temp=temp*a;
	         }
	         if(n<0) return 1.0/temp;
	         return temp;
	     }
	     
	     public static void main(String[] args) {
	    	 powerOfDouble p=new powerOfDouble();
			 Scanner sc=new Scanner(System.in);
			 while(true){
			 double base=sc.nextDouble();
			 int exponent=sc.nextInt();
		     System.out.println(p.Power(base, exponent));
		     System.out.println(Math.pow(base,exponent));
			 }
			}
}
