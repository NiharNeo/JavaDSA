package DAY6.SESSION2;

public class Leetcod209 {
    public int minSubArrayLen(int target, int[] nums) {

        int left =0;
        int minLen=Integer.MAX_VALUE;
        int sum=0;

        for(int  right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            if(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return (minLen==Integer.MAX_VALUE) ? 0: minLen;
    }
}
