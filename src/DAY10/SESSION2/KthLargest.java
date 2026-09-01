package DAY10.SESSION2;

import java.util.Arrays;
import java.util.Collections;

public class KthLargest {

    public static void main(String[] args){
        Integer[] arr = {5, 2, 8, 1, 9};


        int k = 4;

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[k-1]);

    }
}
