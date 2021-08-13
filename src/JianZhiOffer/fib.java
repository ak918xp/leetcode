package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/13 17:07
 */
public class fib {
    public static void main(String[] args){
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        else{
            int a=0,b=1;
            while(n>1){
                int tmp=b;
                b=(a+b)%1000000007;
                a=tmp;
                n--;
            }
            return b;
        }
    }
}
