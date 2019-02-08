import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String card = in.nextLine();
        boolean db = false;
        for(int i = 0; i < 5; i++) {
            String tmp = in.next();
            if(card.toUpperCase().charAt(0) == tmp.toUpperCase().charAt(0) || card.toUpperCase().charAt(1) == tmp.toUpperCase().charAt(1)) {
                System.out.println("YES");
                db = true;
                break;
            }
        }
        if(!db) System.out.println("NO");
    }
}
