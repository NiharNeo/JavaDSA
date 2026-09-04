package DAY12.SESSION2;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class KeysAndRooms {

    void dfs(int u,List<List<Integer>> rooms,boolean[] visited){

        visited[u]=true;

        for(int v:rooms.get(u)) if(!visited[v]) dfs(v,rooms,visited);
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> dfs = new Stack<>(); dfs.add(0);
        HashSet<Integer> seen = new HashSet<Integer>(); seen.add(0);
        while (!dfs.isEmpty()) {
            int i = dfs.pop();
            for (int j : rooms.get(i))
                if (!seen.contains(j)) {
                    dfs.add(j);
                    seen.add(j);
                    if (rooms.size() == seen.size()) return true;
                }
        }
        return rooms.size() == seen.size();
    }

}
