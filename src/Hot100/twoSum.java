package Hot100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/10 15:49
 */
public class twoSum {
    public static void main(String[] args){

    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])) {
               int[] res = new int[2];
               res[0]=i;
               res[1]=map.get(target-nums[i]);
               return res;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }


}
