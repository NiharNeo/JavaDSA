package DAY7.SESSION1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatInAMaze {

    static boolean findingPath(List<List<Integer>> maze , int x , int y , String path){

        final int n = maze.size();

        if(x == n-1 && y == n-1){
            System.out.println(path);
            return true;
        }

        if(maze.get(x).get(y)==0){
            return false;
        }

        maze.get(x).set(y,0);
        //Down
        if(findingPath(maze,x+1,y,path + 'D')){
            return true;
        }
        //Right
        if(findingPath(maze, x, y+1, path+'R')){
            return true;
        }
        // Backtrack
        maze.get(x).set(y,1);



        return false;

    }
    public static void main(String[] args){
        int [][] matrix = { {1,0,1,0},
                            {1,1,0,0},
                            {0,1,0,0},
                            {1,1,1,1} };

        List<List<Integer>> maze= new ArrayList<>();

        for(int []rows : matrix){
            maze.add(Arrays.stream(rows).boxed().toList());
        }

    }
}
