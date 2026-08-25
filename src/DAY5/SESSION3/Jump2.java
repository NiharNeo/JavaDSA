package DAY5.SESSION3;

public class Jump2 {

        public static int canJump(int[]nums){
            int max=0;
            int end=0;
            int ans=0;
            for(int i=0;i<nums.length;i++){
                if(i>max){
                    return 0;
                }
                max=Math.max(max,i+nums[i]);

                if(max>=nums.length-1){
                   ans++;
                   break;
                }
                if(i==end){
                    ans++;
                    end=max;
                }
            }
            return ans;
        }

        public static void main(String[] args){
            int ums [] = {2,3,1,1,4};
            System.out.println(canJump(ums));
        }
    }
