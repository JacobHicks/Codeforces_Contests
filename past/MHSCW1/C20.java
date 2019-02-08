import java.util.PriorityQueue;
import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nnodes = in.nextInt();
        int nedges = in.nextInt();
        int[][] graph = new int[nnodes][nnodes];
        int[] backref = new int[nnodes];

        for(int i = 0; i < nedges; i++) {
            int n1 = in.nextInt() - 1;
            int n2 = in.nextInt() - 1;
            int w = in.nextInt();
            if(n1 != n2 && (graph[n1][n2] == 0 || graph[n1][n2] > w)) graph[n1][n2] = w;
        }

        PriorityQueue<Node> queue = new PriorityQueue<>();
        boolean pathexists = false;
        queue.offer(new Node(1, 0, -1));
        while(!queue.isEmpty()) {
            Node n = queue.poll();
            if(backref[n.id - 1] == 0) {
                backref[n.id - 1] = n.backref;
                if(n.id == nnodes) {
                    pathexists = true;
                    break;
                }
                for (int n2 = 0; n2 < nnodes; n2++) {
                    if (graph[n.id - 1][n2] != 0) {
                        queue.offer(new Node(n2 + 1, graph[n.id - 1][n2] + n.weight, n.id));
                    }
                }
            }
        }
        if(pathexists) {
            String o = "";
            for(int i = nnodes; i != 1;) {
                o = i + " " + o;
                i = backref[i - 1];
            }
            o = "1 " + o;
            System.out.println(o);
        }
        else {
            System.out.println(-1);
        }
    }
}

class Node implements Comparable<Node> {
    int weight;
    int id;
    int backref;
    public Node(int i, int w, int back) {
        weight = w;
        id = i;
        backref = back;
    }
    public int compareTo(Node o) {
        return weight - o.weight;
    }
}
