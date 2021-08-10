package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/10 10:17
 */
public class reverseLeftWords {
    public static void main(String[] args){
        String a = "abcdefg";
        int n = 2;
        System.out.println(reverseLeftWords(a,n));
    }

    public static String reverseLeftWords(String s, int n) {
        String sub1 = s.substring(0,n);
        String sub2 = s.substring(n);
        return sub2+sub1;
    }
}
