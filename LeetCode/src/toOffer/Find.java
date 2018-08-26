package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
import java.util.*;
public class Find {
		  public static void main(String[] args) { 
		    String input = "httpblogcsdnnetouyangpeng"; 
		    new Find().doString(input); 
		  } 
		  
		  public void doString(String input) { 
		    /** 
		     * 第一步： 
		     *   使用TreeSet快速找到所有出现的字符串 
		     *   将输入的字符串按升序排列 
		     */
		    //将String转换为字符数组 
		    char[] chars=input.toCharArray(); 
		    ArrayList<String> lists=new ArrayList<String>(); 
		    //TreeSet是一个有序集合，TreeSet中的元素将按照升序排列 
		    //通过TreeSet的不重复性，快速找到所有出现的字符串 
		    TreeSet<String> set=new TreeSet<String>(); 
		    for (int i = 0; i < chars.length; i++) { 
		      lists.add(String.valueOf(chars[i])); 
		      set.add(String.valueOf(chars[i])); 
		    } 
		    //set= [a, b, c, d, e, g, h, l, n, o, p, s, t, u, y] 
		    System.out.println("set= "+set);   
		    //排序 
		    Collections.sort(lists); 
		    //lists= [a, b, c, d, e, e, g, g, g, h, l, n, n, n, n, o, o, p, p, s, t, t, t, u, y] 
		    System.out.println("lists= "+lists);   
		    //将排序好的字符数组转换为StringBuffer 
		    StringBuffer sb=new StringBuffer(); 
		    for (int i = 0; i < lists.size(); i++) { 
		      sb.append(lists.get(i)); 
		    } 
		    input=sb.toString();  
		    //input= abcdeeggghlnnnnooppstttuy 
		    System.out.println("input= "+input);   
		      
		    /** 
		     * 第二步： 找出出现相同的字符并记录出现多少次 
		     */
		    //最多重复出现多少次 
		    int max=0; 
		    //重复出现的字符 
		    String maxString=""; 
		    /*//重复出现的字符列表 
		    ArrayList<String> maxList=new ArrayList<String>();*/
		    //用来保存出现最多的字符串和次数 
		    HashMap<String, Integer> hm=new HashMap<String, Integer>(); 
		    //将出现过的字符遍历 
		    Iterator<String> its=set.iterator(); 
		    while (its.hasNext()) { 
		      String os=its.next(); 
		      //字符出现在排序后input中的第一次位置 
		      int begin=input.indexOf(os); 
		      //字符出现在排序后input中的最后一次位置 
		      int end=input.lastIndexOf(os); 
		      //字符出现的次数 
		      int value=end-begin+1; 
		      if (value>=max) { 
		        max=value; 
		        maxString=os; 
		        hm.put(maxString, max); 
		      } 
		    } 
		      
		    for (Map.Entry<String, Integer> enties: hm.entrySet()) { 
		      if (enties.getValue()==max) { 
		        System.out.print("重复最多的字母是:"+enties.getKey()); 
		        System.out.println("重复最多的次数是:"+enties.getValue()); 
		      } 
		    } 
		  } 

}
