package programmars;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++)
            q.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int day = q.poll();
            int count = 1;
            while(!q.isEmpty() && q.peek() <= day){
                count++;
                q.poll();
            }
            list.add(count);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
public class pro0220 {
}
