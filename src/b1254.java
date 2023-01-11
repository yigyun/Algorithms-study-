import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class b1254 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        //tringTokenizer st = new StringTokenizer(bf.readLine(), "", true);
        // StringBuilder sb = new StringBuilder();
        int length = str.length();
        for(int i = 0; i < length; i++)
        {
            if(palindrome(str.substring(i))){
                break;
            }
            length++;
        }
        System.out.println(length);
    }

    static boolean palindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while (end >= start)
        {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;

    }
}