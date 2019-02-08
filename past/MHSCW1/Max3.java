import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            String[] strs = in.nextLine().split(" ");
            if(!(strs.length == 1 && strs[0].equals("0"))) {
                int mx1 = Integer.MIN_VALUE; int mx2 = Integer.MIN_VALUE; int mx3 = Integer.MIN_VALUE;
                int mn1 = Integer.MAX_VALUE; int mn2 = Integer.MAX_VALUE;

                //System.out.println(Math.max(mx1 * mx2, mn1 * mn2) * mx3);
            }
        }
    }
}
