package DAY5.SESSION1;

public class BinarySearch {



    public static int shipWithinDays(int []wights , int days){

        int l=0;
        int r=0;
        for(int w:wights){
            l=Math.max(l,w);
            r+=w;
        }
        int as=r;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(canShip(wights,days,mid)){
                as=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }

        }


        return as;

    }

    public static boolean canShip(int[] weights,int days,int capacity){
        int coveredDay=1;
        int currentLoad=0;

        for(int w : weights){
            if(currentLoad+w > capacity){
                coveredDay++;
                currentLoad=0;
            }
        }
        return coveredDay <=days;
    }
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int h = 5;


    }
}
