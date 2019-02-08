import java.util.HashSet;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        char[] chas = in.nextLine().toCharArray();
        for(char c : chas) {
            if(Character.isAlphabetic(c))
            set.add(c);
        }
        System.out.println(set.size());
    }
}
