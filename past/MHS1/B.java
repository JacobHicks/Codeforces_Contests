import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ds = in.nextInt();
        int[] rots = new int[ds];
        for(int i = 0; i < ds; i++) {
            rots[i] = in.nextInt();
        }
        System.out.println(r(rots, 0, 0) ? "YES" : "NO");
    }

    public static boolean r(int[] rot, int i, int deg) {
        if(i == rot.length) return deg % 360 == 0;
        return r(rot, i+ 1, deg + rot[i]) || r(rot, i+1, deg - rot[i]);
    }
}
