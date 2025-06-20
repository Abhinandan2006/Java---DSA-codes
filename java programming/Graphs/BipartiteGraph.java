import java.util.*;

public class BipartiteGraph {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        int v = graph.length; // Number of vertices

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Directed edges
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 4));
        graph[1].add(new Edge(1, 5));

        graph[2].add(new Edge(2, 6));
        graph[2].add(new Edge(2, 7));

        graph[3].add(new Edge(3, 8));
        graph[3].add(new Edge(3, 9));

        // Bidirectional edges
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));

        // More directed edges
        graph[6].add(new Edge(6, 7));
        graph[6].add(new Edge(6, 9));

        graph[7].add(new Edge(7, 8));
        graph[8].add(new Edge(8, 9));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                col[i] = 0;// red
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j = 0; j < graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if (col[e.dest] == -1) {
                            int nextCol = col[curr] == 0 ? 1 : 0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        } else if (col[e.dest] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int v = 10;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph); 
        System.out.println(isBipartite(graph));
        
    }
}

