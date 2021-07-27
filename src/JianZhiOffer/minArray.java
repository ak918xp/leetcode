package JianZhiOffer;

public class minArray {

    public static void main(String[] args) {
        int[] nums = new int[]{22,0,1};
//        int[] nums = new int[]{2,2,2,0,1};
        int res =minArray(nums);
        System.out.println(res);
    }

    public static int minArray(int[] numbers) {
        int left=0,right=numbers.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(numbers[mid]>numbers[right]){
                left=mid+1;
            }
            else if(numbers[mid]<numbers[right]){
                right=mid;
            }
            else{
                right--;
            }
        }
        return numbers[left];
    }
}
