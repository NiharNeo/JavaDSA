package DAY13.SESSION1;

public class SingleNumber {


        public int singleNumber(int[] nums) {
            int ans = 0;
            for(int val : nums){
                ans = ans ^ val;
            }
            return ans;
        }

}
