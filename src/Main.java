import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), "<> ", true);
        StringBuilder sb = new StringBuilder();
        //Scanner sc = new Scanner(System.in);
        while(st.hasMoreTokens()) {
            String str = st.nextToken();
            if(str.charAt(0) == '<')
            {
                sb.append("<");
                str = st.nextToken();
                while(str.charAt(0) != '>'){
                    sb.append(str);
                    str = st.nextToken();
                }
                sb.append(">");
            }
            else if(str.charAt(0) == ' '){
                sb.append(" ");
            }
            else{
                StringBuffer sb2 = new StringBuffer(str);
                String rs = sb2.reverse().toString();
                sb.append(rs);
            }
        }
        System.out.println(sb);
    }
}