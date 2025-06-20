import java.lang.reflect.Array;
import java.util.*;

public class CC {
    static class Edge {
        int src, dest, wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        int v = graph.length; // Number of vertices

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
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

    // Function to print the graph
    public static void printGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + ", " + e.wt + ") ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]){ //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);//source = 0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr+" ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size() ; i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        } 
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]){
        //visited
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {
        int v = 10;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph); 
        printGraph(graph); // Display graph
        bfs(graph);
    }
}
