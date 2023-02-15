import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str= br.readLine();
            int[] num = new int[10];
            int length = str.length();
            int count = 0;

            for(int i = 0; i < length; i++){
                int temp = Integer.parseInt(str.substring(i, i+1));
                num[temp] += 1;
                count += temp;
            }
            if(count % 3 == 0 && str.contains("0")) {
                for (int i = 9; i >= 0; i--) {
                    while (num[i] > 0) {
                        System.out.print(i);
                        num[i]--;
                    }
                }
            }
            else{
                System.out.println(-1);
            }
        }
    }