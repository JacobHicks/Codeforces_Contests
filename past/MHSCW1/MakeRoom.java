import java.util.Scanner;

public class MakeRoom {
    static int go, si, br;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ds = in.nextInt();
        while(ds-- > 0) {
            int gold = in.nextInt();
            int silv = in.nextInt();
            int bron = in.nextInt();
            coin(gold, silv, bron, new int[gold + 1][silv + 1][bron + 1]);
            System.out.println(go + " " + si + " " + br);
        }
    }

    public static int coin(int g, int s, int b, int[][][] dp) {
        if(g <= 0 || s <= 0 || b <= 0) return Integer.MAX_VALUE;
        if(dp[go][si][br] != 0) return g + s + b;
        dp[go][si][br] = g + s + b;
        int val = Math.min(Math.min(coin(g + 1, s - 10, b, dp), coin(g, s + 1, b - 5, dp)), g + s + b);
        if(min > val) {
            min = val;
            go = g; si = s; br = b;
        }
        dp[go][si][br] = val;
        return val;
    }
}
