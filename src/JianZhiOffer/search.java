package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/10 10:57
 */
public class search {
    public static void main(String[] args){
        int[] nums = new int[]{1};
        search(nums,1);
    }

    public static void search(int[] nums, int target) {
        int res = binSearch(nums,target);
        System.out.println(res);
    }

    public static int binSearch(int[] nums,int target){
        int left=0,right=nums.length-1;
        int initPlace=-1;
        int count=0;
//        if(left==right && nums[left]==target){
//            count++;
//            initPlace=left;
//        }
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left = mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                initPlace=mid;
                count++;
                break;
            }
        }
        if(count>0){
            int leftFind=initPlace-1;
            int rightFind=initPlace+1;
            while(rightFind< nums.length){
                if(nums[rightFind]==target){
                    count++;
                    rightFind++;
                }
                else{
                    break;
                }
            }
            while(leftFind>=0){
                if(nums[leftFind]==target){
                    count++;
                    leftFind--;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
