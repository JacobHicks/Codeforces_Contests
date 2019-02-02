import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nsticks = in.nextInt();
        int[] sticks = new int[nsticks];
        for(int i = 0; i < nsticks; i++) {
            sticks[i] = in.nextInt();
        }
        int mincost = 101;
        int minlen = -1;
        for(int i = 1; i <= 100; i++) {
            int sum = 0;
            for(int x = 0; x < nsticks; x++) {
                if(sticks[x] != i) {
                    int tmp = Math.min(Math.abs(sticks[x] - i), Math.min(Math.abs(sticks[x] + 1 - i), Math.abs(sticks[x] - 1 - i)));
                    sum += tmp;
                }
            }
            if(mincost > sum || sum == 0) {
                mincost = sum;
                minlen = i;
            }
        }
        System.out.println(minlen + " " + mincost);
    }
}
