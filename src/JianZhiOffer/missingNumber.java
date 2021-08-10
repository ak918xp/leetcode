package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/10 10:47
 */
public class missingNumber {
    public static void main(String[] args){
        int[] nums = new int[]{0,1,2,3,4,5,6,7,9};
        int res = missingNumber(nums);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        int max = nums.length;
        for(int i=0;i<max;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return max;
    }

}
