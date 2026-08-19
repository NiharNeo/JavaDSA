package DAY1.SESSION3;

import java.util.Scanner;

public class KeprekarNumber {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //int n=45;
        int sqr = n*n;
        boolean found = false;

        String s1 = String.valueOf(sqr);
        int len = s1.length();

        for (int i=0;i<len;i++){
            String leftp=s1.substring(0,i);
            String rightp = s1.substring(i);

            int left = Integer.parseInt(leftp);
            int right = Integer.parseInt(rightp);

            if(left+right==n){
                System.out.println("it is Keprekar Number");
                found = true;
            }
        }
        if (found) {
            System.out.println("Keprkar");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
