import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            int T = Integer.parseInt(br.readLine());
            int[][] ap = new int[T][2];

            for(int i = 0; i < T; i++){
                st = new StringTokenizer(br.readLine());
                ap[i][0] = Integer.parseInt(st.nextToken());
                ap[i][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(ap, new Comparator<int[]>(){
                @Override
                public int compare(int[] o1, int[] o2){
                    return o1[0] - o2[0];
                }
            });
            int min = ap[0][1];
            int count = 0;
            for(int j = 0; j < T; j++){
                if(ap[j][1] > min) {
                    count++;
                }else
                    min = ap[j][1];
            }
            System.out.println(T-count);
        }

    }
}