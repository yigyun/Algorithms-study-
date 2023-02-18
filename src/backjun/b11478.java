package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String str = bf.readLine();
        int c = 0;
        int slength = str.length();
        char[] art = new char[slength];
        while(c < slength){
            for(int i = 0; i < slength; i++) {
                if(i+c >= slength)
                    break;
                set.add(str.substring(i,i+c+1));
            }
            c++;
        }
        System.out.println(set.size());
    }
}