package JianZhiOffer;

import java.util.List;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/29 11:50
 */
public class minNumber {
    public String minNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(compare(nums[j],nums[j+1])==true){
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
        String res="";
        for(int i=0;i<nums.length;i++){
            res=res+String.valueOf(nums[i]);
        }
        return res;
    }

    public boolean compare(int num1,int num2){
        String snum1=String.valueOf(num1);
        String snum2=String.valueOf(num2);
        String newNum1 = snum1+snum2;
        String newNum2 = snum2+snum1;
        if(newNum1.compareTo(newNum2)>0){
            return true;
        }else{
            return false;
        }
    }
}
