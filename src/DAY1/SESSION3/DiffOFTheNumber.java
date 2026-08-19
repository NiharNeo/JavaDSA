package DAY1.SESSION3;

import java.util.Scanner;

public class DiffOFTheNumber {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int n= 125;
        String str = String.valueOf(n);
        int len = str.length();

        String F = str.substring(0,1);
        String L = str.substring(len-1);

        //System.out.println(F);
        //System.out.println(L);
        int fi = Integer.parseInt(F);
        int li = Integer.parseInt(L);

        if(fi>li){
            System.out.println(fi-li);
        }
        else{
            System.out.println(li-fi);
        }


    }
}
