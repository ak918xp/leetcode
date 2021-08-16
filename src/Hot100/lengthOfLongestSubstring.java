package Hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/16 10:59
 */
public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left=0,right=0;
        int max=0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left++));
                }
                set.add(s.charAt(right++));
            }
            else{
                set.add(s.charAt(right++));
                if(set.size()>max){
                    max=set.size();
                }
            }
        }
        return max;
    }
}
