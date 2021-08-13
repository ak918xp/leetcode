package JianZhiOffer;

import java.util.Stack;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/13 18:13
 */
public class maxProfit {
    public static int maxProfit(int[] prices) {
        //股票没有开盘
        if (prices == null || prices.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        //第一天的股票价格
        stack.push(prices[0]);
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            //如果栈顶元素大于prices[i]，那么栈顶元素出栈，
            //把prices[i]压栈，要始终保证栈顶元素是最小的
            if (stack.peek() > prices[i]) {
                stack.pop();
                stack.push(prices[i]);
            } else {
                //否则如果栈顶元素不大于prices[i]，就要计算
                //prices[i]和栈顶元素的差值
                max = Math.max(max, prices[i] - stack.peek());
            }
        }
        return max;
    }

}
