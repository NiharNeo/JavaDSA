package DAY7.SESSION1;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class subsets {

    public static void backtracking(int start,int[]nums,List<Integer> current,List<List<Integer>> result){

        result.add(new ArrayList<>(current) );
        for(int i=start;i<nums.length;i++){
            current.add(nums[i]);
            backtracking(i+1,nums,current,result);

            current.remove(current.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtracking(0, nums, current, result);





        return result;


    }

    public static void main(String []args){
        int [] nums = {1,2,3};

        List<List<Integer>> ans = subsets(nums);
        for(List<Integer> subset : ans){
            System.out.println(subset);
        }

    }
}
