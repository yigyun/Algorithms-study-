//프록래머스 124 나라의 숫자

import java.util.*;

class p001 {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";
        int i = n;
        while(i > 0){
            int temp = i % 3;
            i /= 3;
            if(temp == 0) i--;
            answer = numbers[temp] + answer;
        }
        return answer;
    }
}