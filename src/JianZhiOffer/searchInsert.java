package JianZhiOffer;

public class searchInsert {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,4,5};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left=0,right=n-1;
        while(left<=right){
            int mark=(left+right)/2;
            if(nums[mark]>target){
                right=mark-1;
            }
            else if(nums[mark]<target){
                left=mark+1;
            }
            else{
                return mark;
            }
        }
        if(nums[left]>target){
            return left;
        }
        else{
            return left+1;
        }
    }
}
