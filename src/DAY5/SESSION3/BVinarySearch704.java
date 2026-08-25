package DAY5.SESSION3;

public class BVinarySearch704 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r=0;



        int as=r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (nums[mid] > target) {
                r = mid - 1;
            }

            else {
                l = mid + 1;
            }




        }
        return -1;
    }

}
