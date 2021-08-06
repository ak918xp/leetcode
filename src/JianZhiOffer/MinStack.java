package JianZhiOffer;

import java.util.Stack;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/6 10:39
 */
public class MinStack {
    Stack<Integer> numStack ;
    Stack<Integer> minStack ;
    public MinStack() {
        numStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if(numStack.isEmpty()){
            numStack.push(x);
            minStack.push(x);
        }
        else{
            if(minStack.peek()>x){
                numStack.push(x);
                minStack.push(x);
            }
            else{
                numStack.push(x);
                minStack.push(minStack.peek());
            }
        }
    }

    public void pop() {
        numStack.pop();
        minStack.pop();
    }

    public int top() {
        return numStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
