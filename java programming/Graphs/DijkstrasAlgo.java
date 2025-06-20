import java.util.ArrayList;
import java.util.*;

public class DijkstrasAlgo {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {// FALSE no cycle
        int v = graph.length; // Number of vertices

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 3));
        graph[0].add(new Edge(0, 2, 5));
        graph[0].add(new Edge(0, 3, 7));

        graph[1].add(new Edge(1, 4, 6));
        graph[1].add(new Edge(1, 5, 2));

        graph[2].add(new Edge(2, 6, 8));
        graph[2].add(new Edge(2, 7, 4));

        graph[3].add(new Edge(3, 8, 9));
        graph[3].add(new Edge(3, 9, 1));

        // Bidirectional edges
        graph[4].add(new Edge(4, 5, 5));
        graph[5].add(new Edge(5, 4, 5));

        // More directed edges
        graph[6].add(new Edge(6, 7, 3));
        graph[6].add(new Edge(6, 9, 2));

        graph[7].add(new Edge(7, 8, 4));
        graph[8].add(new Edge(8, 9, 7));
    }

    static class Pair implements Comparable<Pair> {

        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }

    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length]; //dist[i] --> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE; // +infinity
            }
        }

        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));
        //loop
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                //neighbours
                for(int i = 0; i < graph[curr.n].size(); i++){
                    Edge e = graph[curr.n].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u]+wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        // print all distance
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v = 10;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);
        int src = 0;
        dijkstra(graph, src);
    }
}
