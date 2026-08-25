package DAY5.SESSION2;

import java.util.Arrays;

public class arrayPartitio561 {

    public int arrayPairSum(int[] nums) {

        int ans=0;

        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            ans += nums[i];
        }
        return ans;

    }
}
