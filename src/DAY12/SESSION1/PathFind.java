package DAY12.SESSION1;

import java.util.ArrayList;

public class PathFind {

    public boolean checkPath(int n, int[][] edges, int src, int des) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return dfs(src, des, graph, visited);
    }

    public boolean dfs(int curr, int des, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        // Base case:
        if (curr == des) {
            return true;
        }

        visited[curr] = true;

        for (int nbr : graph.get(curr)) {
            if (!visited[nbr]) {
                if (dfs(nbr, des, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PathFind finder = new PathFind();

        int n = 3;
        int[][] edge = {
                {0, 1},
                {1, 2},
                {2, 0}
        };
        int src = 0;
        int des = 2;

        boolean res = finder.checkPath(n, edge, src, des);
        System.out.println("Path exists: " + res);
    }
}
