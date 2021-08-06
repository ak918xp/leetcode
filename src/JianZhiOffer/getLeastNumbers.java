package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/6 12:25
 */
public class getLeastNumbers {
    public static void main(String[] args){

    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr,0,arr.length-1);
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
    }

    public static void quickSort(int[] nums,int left,int right){
        if (left < right) {
            int i = left, j = right, x = nums[left];
            while (i < j) {
                while(i < j && nums[j] >= x) {
                    // 从右向左找第一个小于x的数
                    j--;
                }
                if(i < j){
                    nums[i++] = nums[j];
                }
                while(i < j && nums[i] < x){
                    // 从左向右找第一个大于等于x的数
                    i++;
                }
                if(i < j){
                    nums[j--] = nums[i];
                }
            }
            nums[i] = x;
            quickSort(nums, left, i - 1); // 递归调用
            quickSort(nums, i + 1, right);
        }
    }
}
