
// Leetcode 169

package DAY1.SESSION3;

public class MajorityElemwnt {
    public static void main(String[]args){
        int [] t1 = {3,2,3};
        int [] t2 = {2,2,1,1,1,2,2};

        int candidate = 0;
        int count = 0;

        for(int num : t2){
            if(count==0){
                candidate=num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        System.out.println(candidate);
    }
}
