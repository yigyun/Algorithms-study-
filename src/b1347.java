import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1347 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        //StringTokenizer st = new StringTokenizer(bf.readLine(), "", true);
        StringBuilder sb = new StringBuilder();

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {50, 50});
        int row, col, rowh, colh, rowl, coll;
        row = col = rowh = colh = rowl = coll = 50;


        int direct = 0; // 0123 남서북동
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'L': {
                    if (direct == 3)
                        direct = 0;
                    else direct--;
                }
                case 'R':{
                    if(direct == 3)
                        direct = 0;
                    else direct++;
                }
                case 'F': {
                    if(direct == 0){
                        row++;
                        if(rowh < row) rowh = row;
                    }
                    else if(direct == 1){
                        col--;
                        if(coll > col) coll = col;
                    }
                    else if(direct == 2) {
                        row--;
                        if (rowl > row) rowl = row;
                    }
                    else if(direct == 3) {
                        col++;
                        if(colh < col) colh = col;
                    }
                }
                default: {
                    if(direct == 0){
                        row--;
                        if(rowl > row) rowl = row;
                    }
                    else if(direct == 1){
                        col++;
                        if(colh < col) colh = col;
                    }
                    else if(direct == 2) {
                        row++;
                        if (rowh < row) rowh = row;
                    }
                    else if(direct == 3) {
                        col--;
                        if(coll > col) coll = col;
                    }
                }
            }
            list.add(new int[] {row, col});
        }
        char[][] miro = new char[101][101];

        for(int j = rowl; j <= rowh; j++){
            for(int k = coll; k <= colh; k++)
                miro[j][k] = '#';
        }

        for(int q = 0; q < list.size(); q++){
            int[] temp = list.get(q);
            miro[temp[0]][temp[1]] = '.';
        }

        for(int j = rowl; j <= rowh; j++){
            for(int k = coll; k <= colh; k++)
                sb.append(miro[j][k]);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}