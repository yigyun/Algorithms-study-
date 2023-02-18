package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), "*");
        String f = st.nextToken();
        String e = st.nextToken();
        Pattern p = Pattern.compile("^" + f + "[a-z]*" + e + "$");
        //Pattern p2 = Pattern.compile("." + e);
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            Matcher m = p.matcher(str);
            /// Matcher m2 = p2.matcher(str);
            if(m.matches()){
                sb.append("DA").append('\n');
            }else
                sb.append("NE").append('\n');
        }
        System.out.print(sb);
    }
}