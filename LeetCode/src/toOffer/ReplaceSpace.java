package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class ReplaceSpace {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Solution s=new Solution();
           StringBuffer str=new StringBuffer("we are happy");
           String t=s.replaceSpace(str);
          System.out.println(t);
	}

}
 class Solution {
    public String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
       StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }
}
