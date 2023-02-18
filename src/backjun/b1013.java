package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class b1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        //StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String pattern ="(100+1+|01)+";
        for(int i = 0; i < N; i++){
            boolean check = Pattern.matches(pattern, br.readLine());
            if(check)   System.out.println("YES");
            else System.out.println("NO");
        }
    }
}