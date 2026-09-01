package DAY10.SESSION2;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestStream {
    public String kthLargestNumber(String[] nums, int k) {


        Integer[] wrapperArray = Arrays.stream(nums)
                .map(Integer::valueOf)
                .toArray(Integer[]::new);


        Arrays.sort(wrapperArray, Collections.reverseOrder());

        return String.valueOf(wrapperArray[k-1]);

    }
}
