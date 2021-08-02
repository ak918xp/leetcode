package JianZhiOffer;

public class exchange {
    public static void main(String[] args){
        int[] nums = new int[]{2,4,6};
        int[] res = exchange(nums);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] exchange(int[] nums){
        int left=0,right=nums.length-1;
        while(left<right){
            while(left<right && nums[left]%2==0){
                int tmp=nums[left];
                nums[left]=nums[right];
                nums[right]=tmp;
                right--;
            }
            left++;
        }
        return nums;
    }
}
