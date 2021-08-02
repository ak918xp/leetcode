package JianZhiOffer;

public class hammingWeight {
    public static void main(String[] args){
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}
