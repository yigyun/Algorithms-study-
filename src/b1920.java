import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<Integer> setA = new HashSet<>();
        for(int i = 0; i < N; i++)
            setA.add(Integer.parseInt(st.nextToken()));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int j = 0; j < M; j++)
        {
            if(setA.contains(Integer.parseInt(st.nextToken())))
                sb.append("1").append('\n');
            else
                sb.append("0").append('\n');
        }
        System.out.print(sb);
    }
}