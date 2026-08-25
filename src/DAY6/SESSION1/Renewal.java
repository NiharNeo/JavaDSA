package DAY6.SESSION1;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Renewal {

    public static int max( int []num, int k){
        int max=0;

        int n = num.length;

        int left=0;
        //int right=0;
        for(int right=0;right<n;right++){
              if (num[left]-num[right]>k) {
                  left++;
            }
              max = Math.max(max,right-left+1);
        }

        return max;
    }

    public static void main(String[] args){

        int [] days={1,3,5,7,9};

        //ArrayList<Integer> days = new ArrayList<>();
        //days= (ArrayList<Integer>) Arrays.asList(1,3,5,7,9);


        int k = 4;
        System.out.println(max(days,k));

    }



}
