package JianZhiOffer;

/**
 * @author lihaoyuan
 * @version 1.0
 * @date 2021/8/24 10:37
 */
public class reverseWords {
    public static void main(String[] args){
        String s = " a good   example ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] inputParams = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=inputParams.length-1;i>=0;i--){
            if(!"".equals(inputParams[i])){
                sb.append(inputParams[i]);
                sb.append(" ");
            }
        }
        String res = sb.toString();
        res=res.trim();
        return res;
    }
}
