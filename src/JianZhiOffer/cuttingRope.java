package JianZhiOffer;

public class cuttingRope {
    public static void main(String[] args){

    }

    public static int cuttingRope(int n) {
        if(n==2){
            return 1;
        }
        else if(n==3){
            return 2;
        }
        else if(n==4){
            return 4;
        }
        int sum=1;
        while(n>4){
            sum=sum*3;
            n-=3;
        }
        sum*=n;
        return sum;
    }

    static int value=1000000007;
    public static int cuttingRopeII(int n) {
        if(n==2){
            return 1;
        }
        else if(n==3){
            return 2;
        }
        else if(n==4){
            return 4;
        }
        long sum=1;
        while(n>4){
            sum=(sum*3)%value;
            n-=3;
        }
        sum=(sum*n)%value;
        return (int) sum;
    }


}
