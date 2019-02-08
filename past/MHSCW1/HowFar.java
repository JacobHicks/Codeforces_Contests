import java.util.Scanner;

public class HowFar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            double v = in.nextDouble();
            double a = in.nextDouble();
            double t = in.nextDouble();
            if(v == a && a == t && t == 0) break;
            System.out.printf("%.3f", v*t + (1.0/2)*(a*Math.pow(t, 2)));
        }

    }
}
