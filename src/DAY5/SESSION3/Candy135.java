package DAY5.SESSION3;

public class Candy135 {

    public static int candy(int []rating){
        int n = rating.length;
        int [] can= new int[n];
        for (int i=0;i<rating.length;i++){
            can[i]=1;
        }

        for (int i = 1; i < n; i++) {
            if (rating[i] > rating[i - 1]) {
                can[i] = can[i - 1] + 1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(rating[i]>rating[i+1]){
                can[i] = Math.max(can[i],can[i+1]+1);
            }
        }

        int tc=0;
        for(int c:can){
            tc+=c;

        }
        return tc;
    }

    public static void main(String[] args){
        int [] num = {1,0,2};
        System.out.println(candy(num));
    }
}
