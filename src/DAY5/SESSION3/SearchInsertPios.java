package DAY5.SESSION3;

public class SearchInsertPios {

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        int ans=0;
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]== target){
                flag=1;
               return i;

            }


        }
        if(flag==0){
            for(int i=0;i<nums.length-1;i++){
             if(nums[i]<target && nums[i+1]>target){
                 return i;
             }
            }
        }

        return -1;

    }

    public static void main(String[] args){
        int [] nums = {1,3,5,6};
        int target =7;

        System.out.println(searchInsert(nums,target));
    }
}

