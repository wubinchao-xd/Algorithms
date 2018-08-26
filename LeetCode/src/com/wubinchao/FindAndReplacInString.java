package com.wubinchao;
/**
 * @ClassName: 
 * @Description:
 * @author: 
 * @date: 
 */
public class FindAndReplacInString {

	public static void main(String[] args) {
		//"abcd" [0, 2] ["a", "cd"] ["eee", "ffff"]   
		//"eeebffff"
		//"vmokgggqzp"
		//[3,5,1]
		//["kg","ggq","mo"]
		//["s","so","bfr"]
		Solution st=new Solution();
		int [] arr={0,2};
		String [] sources={"a", "cd"};
		String [] targets={"eee", "ffff"};
		st.findReplaceString("abcd",arr,sources, targets);
		
		int [] arr1={3,5,1};
		String [] sources1={"kg","ggq","mo"};
		String [] targets1={"s","so","bfr"};
		st.findReplaceString("vmokgggqzp",arr1,sources1,targets1);

	}

}
class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
       int n=indexes.length;
       
        int slen=0;
        String stemp=new String();
        int[] test=new int[n];
        for (int i=0;i<n;i++){
          slen=sources[i].length();
            stemp=(S.substring(indexes[i],indexes[i]+slen).toString());
            System.out.println(stemp);
            if(stemp.equals(sources[i]))
                   test[i]=1;       
        }
        String ans=new String();
        StringBuffer re=new StringBuffer();
        int p=0;
        for(int k=0;k<n;k++){
            if(test[k]==1){
            	if(indexes[k]!=0)
                ans=ans.concat(S.substring(p,indexes[k]));
                ans=ans.concat(targets[k]);
                p=indexes[k]+sources[k].length();
                
            }
        }
             re.append(ans);
             if(p<=S.length())
        re.append(S.substring(p));    
            System.out.println(re.toString());
       return re.toString();
    }
}