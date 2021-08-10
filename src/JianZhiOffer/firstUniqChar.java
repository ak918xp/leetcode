package JianZhiOffer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/10 14:10
 */
public class firstUniqChar {
    public static char firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int length = c.length;
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<length;i++){
            map.put(c[i],map.getOrDefault(c[i],0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
