import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ds = in.nextInt();
        boolean possible = true;
        int last = 0;
        while(ds-- > 0) {
            int v = in.nextInt();
            if(last != 0 && v == last) {
                possible = false;
                break;
            }
            last = v;
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
