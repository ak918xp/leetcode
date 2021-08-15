package JianZhiOffer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/15 22:46
 */
public class maxSubArray {
    public static void main(String[] args){
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>dp[i-1]+nums[i]){
                dp[i]=nums[i];
            }
            else{
                dp[i]=dp[i-1]+nums[i];
            }
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
