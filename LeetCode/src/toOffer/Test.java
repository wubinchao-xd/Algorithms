package toOffer;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Iterator;  
import java.util.TreeSet;  
  
  
public class Test {  
    public static void main(String args[]){  
        String input = "adsfsafasdfjlafdjgkdfa";  
        new Test().doString(input);  
    }  
  
    public void doString(String input){  
        char[] chars = input.toCharArray();  
        ArrayList<String> lists = new ArrayList<String>();  
        TreeSet set = new TreeSet();  
        for(int i=0;i<chars.length;i++){  
            lists.add(String.valueOf(chars[i]));  
            set.add(String.valueOf(chars[i]));  
        }  
        System.out.println(set); //setû���ظ���Ԫ��  
        Collections.sort(lists);  
        System.out.println(lists); //sort����  
  
        StringBuffer sb = new StringBuffer();  
        for(int i=0;i<lists.size();i++){  
            sb.append(lists.get(i));  
        }  
        input = sb.toString();  
        System.out.println(input);  
        int max = 0;  
        String maxString = "";  
        ArrayList maxlist = new ArrayList();  
  
        Iterator its = set.iterator();  
        while(its.hasNext()){  
            String os = (String)its.next();  
            int begin = input.indexOf(os);  
            int end = input.lastIndexOf(os);  
            int value = end - begin + 1;  
            if(value > max){  
                max = value;  
                maxString = os;  
                maxlist.add(os);  
            }  
            else if(value == max){  
                maxlist.add(os);  
            }  
        } 
        System.out.println(maxlist);
  
        int index = 0;  
        for(int i=0;i<maxlist.size();i++){  
            if(maxlist.get(i).equals(maxString)){  
                index = i;  
                break;  
            }  
        }  
        System.out.println("���������ַ��ֱ���:");  
        for(int i=index;i<maxlist.size();i++){  
            System.out.println(maxlist.get(i) + "  ");  
        }  
        System.out.println();  
        System.out.println("�������Ĵ���Ϊ" + max);  
    }  
}  