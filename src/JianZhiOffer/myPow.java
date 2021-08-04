package JianZhiOffer;

public class myPow {
    public static void main(String[] args){
        double x = 2.00;
        int n = -2147483648;
        double res = myPow(x,n);
        System.out.println(res);
    }

    public static double myPow(double x, int n) {
        long mark=n;
        double res = 1;
        if(x==0 || x==1){
            return x;
        }
        if(mark==0){
            return 1;
        }
        else if(mark<0){
            x=1/x;
            mark=-mark;
        }
        while(mark>0){
            if((mark&1)==1){
                res*=x;
            }
            x*=x;
            mark=mark>>1;
        }
        return res;
    }
}
