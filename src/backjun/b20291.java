package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> hmap = new HashMap<>();
        while(N > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String str = st.nextToken();
            if(hmap.containsKey(str))
            {
                int num = hmap.get(str);
                num++;
                hmap.replace(str,num);
            }
            else
                hmap.put(str, 1);
            --N;
        }

        Map<String, Integer> sortmap = new TreeMap<>(hmap);
        for (String s : sortmap.keySet()) {
            System.out.println(s + " " + sortmap.get(s));
        }

    }
}