import java.util.*;
import java.io.*;

public class b1003{

    static int c0 = 0;
    static int c1 = 0;
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] c = new int[41];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        int[] answer = new int[2];
        //int[][] answer = new int[N][2];
        for(int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            dp[M] = fibo(M);

        }
    }

    public static Integer[] fibo(int n){
        if(dp[n][0] == null || dp[n][1] == null)

    }
}