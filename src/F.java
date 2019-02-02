import java.util.HashSet;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ds = in.nextInt();
        int num = in.nextInt();
        int res = 0;
        in.nextLine();
        lab:
        for(int i = 0; i < ds; i++) {
            String n = in.nextLine();
            for(int x = 0; x <= num; x++) {
                if(!n.contains("" + (char)(x + '0'))) continue lab;
            }
            res++;
        }
        System.out.println(res);
    }
}
