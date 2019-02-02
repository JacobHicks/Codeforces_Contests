import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ds = in.nextInt();
        int groups = 0;
        int last = -1;
        while(ds-- > 0) {
            int n = in.nextInt();
            if(last != n) groups++;
            last = n;
        }
        System.out.println(groups);
    }
}
