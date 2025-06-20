import java.lang.reflect.Array;
import java.util.*;

import Recurssion.recurssion;

public class GraphCycle {
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

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detectCycleUtil(graph, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par){
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            //case3 
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }

            // case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }

            // case 2 --> do nothing eat 5 star
        }
        return false;
    }
    
    public static void main(String[] args) {
        int v = 10;
        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph); 
        System.out.println(detectCycle(graph));
    }
}

