import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1931 {

    static class Conference {
        public int sTime;
        public int eTime;

        public Conference(int sTime, int eTime) {
            this.sTime = sTime;
            this.eTime = eTime;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Conference> conList = new ArrayList<>();
        //입력
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            Conference c = new Conference(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            conList.add(c);
        }
        //정렬
        Collections.sort(conList, new Comparator<Conference>() {
            @Override
            public int compare(Conference o1, Conference o2) {
                if (o1.eTime == o2.eTime) {
                    return o1.sTime - o2.sTime;
                }
                return o1.eTime - o2.eTime;
            }
        });

        //countMax를 찾는다.
        int cTime = 0;
        int count = 0; //회의 수
        for (Conference conference : conList) {
            if(cTime <= conference.sTime)
            {
                count++;
                cTime = conference.eTime;
            }
        }
        System.out.print(count);
    }
}