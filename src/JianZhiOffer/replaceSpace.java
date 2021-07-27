package JianZhiOffer;

public class replaceSpace {
    public static void main(String[] args){
        String str = "we are happy";
        System.out.println(replaceSpace(str));
    }

    public static String replaceSpace(String s){
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                sb.append("%20");
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
