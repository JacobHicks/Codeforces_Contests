import java.util.HashMap;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nevents = in.nextInt();
        int nfriends = in.nextInt();
        in.nextLine();
        int[] events = new int[nevents];
        String[] names = new String[nevents];
        for(int i = 0; i < nevents; i++) {
            String[] buf = in.nextLine().split(" ");
            events[i] = Integer.parseInt(buf[0]);
            if(buf.length == 2) names[i] = buf[1];
        }
        HashMap<String, Integer> occurences = new HashMap<>();
        int sum = 0;
        int max = 0;
        for(int i = nevents - 1; i >= 0; i--) {
            if(events[i] == 1) {
                sum += max;
                //occurences = new HashMap<>();
                max = 0;
            }
            else if(events[i] == 2) {
                occurences.put(names[i], occurences.getOrDefault(names[i], 0) + 1);
                max = Math.max(occurences.get(names[i]), max);
            }
        }
        System.out.println(sum);
    }
}
