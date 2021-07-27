package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args){
        String s = "au";
        int res = lengthOfLongestSubstring(s);
        System.out.println(res);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || (s.length()==1)){
            return s.length();
        }
        Map<Character,Integer> map = new HashMap<>();
        int left = 0,right=0;
        int max=0;
        int length=0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                int mark=map.get(s.charAt(right));
                for(int j=left;j<=mark;j++){
                    map.remove(s.charAt(j));
                }
                map.put(s.charAt(right),right);
                left=mark+1;
            }
            else{
                map.put(s.charAt(right),right);
                length=right-left+1;
                if(length>max){
                    max=length;
                }
            }
            right++;
        }
        return max;
    }
}
