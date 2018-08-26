package toOffer;

import java.util.ArrayList;

/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class PrintMatrix {
	
	    public  static ArrayList<Integer> printMatrix(int [][] matrix) {
	        int row=matrix.length;
	        int column=matrix[0].length;
	        System.out.println("row="+row+"column="+column);
	        ArrayList<Integer> list=new ArrayList<>();
	         int start=0;
	         while(row>2*start&&column>2*start){
	        	 print(matrix,start,row,column,list);
	        	 start++;
	         }
	        System.out.println(list); 
	        return list;
	    }
	
	private static void print(int [][] matrix,int start, int row, int column,ArrayList<Integer> list) {
			int endX=column-start-1;
			int endY=row-start-1;
			for(int j=start;j<=endX;j++)
			 list.add(matrix[start][j]);
			if(start<endY){
				for(int j=start+1;j<=endY;j++)
					list.add(matrix[j][endX]);
			}
			if(start<endY&&start<endX){
				for(int j=endX-1;j>=start;j--)
					list.add(matrix[endY][j]);
			}
			if(start<endY-1&&start<endX){
				for(int j=endY-1;j>start;j--)
					list.add(matrix[j][start]);
			}
		}

	public static void main(String[] args) {
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(matrix);
		

	}

}
