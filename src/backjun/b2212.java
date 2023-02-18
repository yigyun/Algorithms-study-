package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b2212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //센서의 갯수
        int K = Integer.parseInt(br.readLine()); //집중국 갯수
        st = new StringTokenizer(br.readLine());
        int[] sensor = new int[N];
        Integer[] sensorLength = new Integer[N-1];
        int result = 0;

        for(int i = 0; i < N; i++){
            sensor[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sensor);

        for(int j = 0; j < N-1; j++){
            sensorLength[j] = sensor[j+1] - sensor[j];
        }

        Arrays.sort(sensorLength, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });

        for(int j = K-1; j < sensorLength.length; j++){
            result += sensorLength[j];
        }

        System.out.println(result);
    }
}