package JianZhiOffer;

import java.util.Arrays;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/29 16:25
 */
public class isStraight {
    public static void main(String[] args){
        int[] nums = new int[]{11,8,12,8,10};
        System.out.println(isStraight(nums));
    }
    public static boolean isStraight(int[] nums) {
        int count0=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
        }
        int gap=0;
        for(int i=count0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]-1>=0){
                gap+=nums[i+1]-nums[i]-1;
            }
            else{
                return false;
            }
        }
        if(gap<=count0){
            return true;
        }
        else{
            return false;
        }
    }
}
