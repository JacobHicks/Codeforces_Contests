import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] parsed = in.readLine().split(" ");
        int strsize = Integer.parseInt(parsed[0]);
        int subsize = Integer.parseInt(parsed[1]);
        String str = in.readLine();
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i + subsize <= strsize;) {
            String sub = str.substring(i, i + subsize);
            int value = isValid(sub.charAt(0), sub, 0);
            if(value == -1) {
                map.put(sub, map.getOrDefault(sub, 0) + 1);
                max = Math.max(map.get(sub), max);
                i += subsize;
            }
            else {
                i += value;
            }
        }

        System.out.println(max);
    }
    public static int isValid(char check, String t, int i) {
        if(i == t.length()) return -1;
        if(t.charAt(i) == check) {
            return isValid(check, t, i + 1);
        }
        else return i;
    }
}
