import java.util.Scanner;

public class Mag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = "";
        while (!(n = in.nextLine().trim()).equals("0")) {
            boolean mag = true;
            for(int i = 1; i < n.length(); i++) {
                if(!isPrime(Integer.parseInt(n.substring(0, i)) + Integer.parseInt(n.substring(i)))) {
                    mag = false;
                    break;
                }
            }
            System.out.println(n + (mag ? " MAGNANIMOUS" : " PETTY"));
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
