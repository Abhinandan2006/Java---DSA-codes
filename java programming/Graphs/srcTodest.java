import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class srcTodest {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {// FALSE no cycle
        int v = graph.length; // Number of vertices

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printAllpath(ArrayList<Edge>[] graph, int src, int dest, String path){
        if (src == dest) {
            System.out.println(path+dest);
            return;
        }

        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllpath(graph, e.dest, dest, path+src);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        int src = 5, dest = 1;
        createGraph(graph);
        printAllpath(graph, src, dest, " ");

    }
}
