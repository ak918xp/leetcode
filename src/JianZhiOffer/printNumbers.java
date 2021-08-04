package JianZhiOffer;

public class printNumbers {
    public static void main(String[] args){

    }

    public static int[] printNumbers(int n) {
        int size=1;
        for(int i=0;i<n;i++){
            size=size*10;
        }
        int[] res = new int[size-1];
        for(int i=0;i<res.length;i++){
            res[i]=i+1;
        }
        return res;
    }
}
