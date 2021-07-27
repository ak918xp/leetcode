package JianZhiOffer;

import java.util.HashSet;
import java.util.Set;

public class findRepeatNumber {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,2,3,4,5,5,6};
        int res = findRepeatNumber2(nums);
        System.out.println(res);
    }
    //普通的解法
    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            else{
                set.add(nums[i]);
            }
        }
        return -1;
    }

    //优秀的解法
    public static int findRepeatNumber2(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(i!=nums[i]){
                int a=nums[i];
                int b=nums[a];
                if(a==b){
                    return a;
                }
                nums[nums[i]]=a;
                nums[i]=b;
            }

        }
        return -1;
    }
}
