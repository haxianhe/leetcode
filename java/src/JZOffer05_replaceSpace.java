/**
 * Created by IDEA.
 *
 * @author haxianhe
 * @date 2021/2/28
 * @time 7:22 下午
 */

public class JZOffer05_replaceSpace {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == ' '){
                sb.append("%20");
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
