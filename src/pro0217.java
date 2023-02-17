
import java.util.Arrays;
import java.util.Comparator;

public class pro0217 {
    public static void main(String[] args) {
        int[][] data = {{2, 2, 6}, {1, 5, 10}, {4, 2, 9}, {3, 8, 3}};
        int row_begin = 2;
        int row_end = 3;
        int col = 2;
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
        System.out.println(answer);
    }
}
