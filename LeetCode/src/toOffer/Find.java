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
		     * ��һ���� 
		     *   ʹ��TreeSet�����ҵ����г��ֵ��ַ��� 
		     *   ��������ַ������������� 
		     */
		    //��Stringת��Ϊ�ַ����� 
		    char[] chars=input.toCharArray(); 
		    ArrayList<String> lists=new ArrayList<String>(); 
		    //TreeSet��һ�����򼯺ϣ�TreeSet�е�Ԫ�ؽ������������� 
		    //ͨ��TreeSet�Ĳ��ظ��ԣ������ҵ����г��ֵ��ַ��� 
		    TreeSet<String> set=new TreeSet<String>(); 
		    for (int i = 0; i < chars.length; i++) { 
		      lists.add(String.valueOf(chars[i])); 
		      set.add(String.valueOf(chars[i])); 
		    } 
		    //set= [a, b, c, d, e, g, h, l, n, o, p, s, t, u, y] 
		    System.out.println("set= "+set);   
		    //���� 
		    Collections.sort(lists); 
		    //lists= [a, b, c, d, e, e, g, g, g, h, l, n, n, n, n, o, o, p, p, s, t, t, t, u, y] 
		    System.out.println("lists= "+lists);   
		    //������õ��ַ�����ת��ΪStringBuffer 
		    StringBuffer sb=new StringBuffer(); 
		    for (int i = 0; i < lists.size(); i++) { 
		      sb.append(lists.get(i)); 
		    } 
		    input=sb.toString();  
		    //input= abcdeeggghlnnnnooppstttuy 
		    System.out.println("input= "+input);   
		      
		    /** 
		     * �ڶ����� �ҳ�������ͬ���ַ�����¼���ֶ��ٴ� 
		     */
		    //����ظ����ֶ��ٴ� 
		    int max=0; 
		    //�ظ����ֵ��ַ� 
		    String maxString=""; 
		    /*//�ظ����ֵ��ַ��б� 
		    ArrayList<String> maxList=new ArrayList<String>();*/
		    //����������������ַ����ʹ��� 
		    HashMap<String, Integer> hm=new HashMap<String, Integer>(); 
		    //�����ֹ����ַ����� 
		    Iterator<String> its=set.iterator(); 
		    while (its.hasNext()) { 
		      String os=its.next(); 
		      //�ַ������������input�еĵ�һ��λ�� 
		      int begin=input.indexOf(os); 
		      //�ַ������������input�е����һ��λ�� 
		      int end=input.lastIndexOf(os); 
		      //�ַ����ֵĴ��� 
		      int value=end-begin+1; 
		      if (value>=max) { 
		        max=value; 
		        maxString=os; 
		        hm.put(maxString, max); 
		      } 
		    } 
		      
		    for (Map.Entry<String, Integer> enties: hm.entrySet()) { 
		      if (enties.getValue()==max) { 
		        System.out.print("�ظ�������ĸ��:"+enties.getKey()); 
		        System.out.println("�ظ����Ĵ�����:"+enties.getValue()); 
		      } 
		    } 
		  } 

}
