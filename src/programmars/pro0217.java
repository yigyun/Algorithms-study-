package programmars;

import java.util.Arrays;
import java.util.Comparator;

class pro0217 {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[col-1] == o2[col-1])
                    return o2[0] - o1[0];
                else
                    return o1[col-1] - o2[col-1];
            }
        });

        int count = 0;
        int[] snum = new int[row_end - row_begin + 1];
        for(int i = row_begin-1; i < row_end; i++){
            int temp = 0;
            for(int j = 0; j < data[0].length; j++)
            {
                temp += (data[i][j] % (i+1));
            }
            snum[count++] = temp;
        }
        answer = snum[0];
        for(int q = 1; q < snum.length; q++)
            answer ^= snum[q];
        return answer;
    }
}