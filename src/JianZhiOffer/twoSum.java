package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/23 11:38
 */
public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]<target){
                left++;
            }
            else if(nums[left]+nums[right]>target){
                right--;
            }
            else{
                int[] res = new int[2];
                res[0]=nums[left];
                res[1]=nums[right];
                return res;
            }
        }
        return new int[2];
    }
}
