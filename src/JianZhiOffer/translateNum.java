package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/16 9:24
 */
public class translateNum {
    public static void main(String[] args){
        int num=506;
        System.out.println(translateNum(num));
    }

    public static int translateNum(int num) {
        List<Integer> nums = new ArrayList<>();
        while(num!=0){
            nums.add(0,num%10);
            num/=10;
        }
        int[] dp = new int[nums.size()+1];
        dp[0]=1;
        if(nums.size()>=2){
            int tmp = 10*nums.get(0)+nums.get(1);
            if(tmp>25){
                dp[1]=1;
            }
            else{
                dp[1]=2;
            }
            for(int i=2;i<nums.size();i++){
                int two=10*nums.get(i-1)+nums.get(i);
                if(10<=two && two<=25){
                    dp[i]=dp[i-1]+dp[i-2];
                }
                else{
                    dp[i]=dp[i-1];
                }
            }
            return dp[nums.size()-1];
        }
        return dp[0];
    }
}
