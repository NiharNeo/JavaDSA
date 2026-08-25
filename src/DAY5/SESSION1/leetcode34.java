package DAY5.SESSION1;


import java.util.Arrays;

public class leetcode34 {

    public static void searchRange(int[] nums, int target) {

        int s = -1;
        int e = -1;
        int[] ans = new int[2];
        int len = nums.length;

        for(int i =0;i<=len;i++){
            if(nums[i] == target){

                s=i;
                break;

            }

        }

       for(int i=nums.length-1;i>=0;i--){
           if(nums[i] == target){
               e=i;
               break;
           }

       }
        ans[0]=s;
        ans[1]=e;

            System.out.println(ans[0]+ " "+ans[1]);



        }


    public static void main(String []args){
        int []nums ={5,7,7,8,8,10};
        int target = 8;

        int []n = {5,7,7,8,8,10};
        int t=6;
        searchRange(nums,target);
    }
    }


