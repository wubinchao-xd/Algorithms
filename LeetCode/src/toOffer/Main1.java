package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
import java.util.*;
public class Main1 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
       String string=in.nextLine();
        Main1 ma=new Main1();
       System.out.print(ma.fun(string));
    }

    public int fun(String str){
        if(str.length()<1||str.length()>10)
            return -1;
        if(str.length()==1)
            return 1;
        HashSet<String> set = new HashSet<String>();
        for(int i =1;i<=str.length();i++){
            String left = str.substring(0,i).replaceAll("^(0+)","");
            String right = str.substring(i,str.length()).replaceAll("(0+)$","");
            left = left.length()==0?"0":left;
            right = right.length()==0?"0":right;
            set.add(left+"."+right);
        }
        
        return set.size();
    }
}
