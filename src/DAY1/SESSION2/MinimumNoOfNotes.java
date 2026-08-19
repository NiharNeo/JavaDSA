package DAY1.SESSION2;

import java.util.Scanner;

public class MinimumNoOfNotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        //int n = 242;
        int c100 = n/100;
        n = n%100;

        int c50 = n/50;
        n = n%50;

        int c20 = n/20;
        n=n%20;
        int c10 = n/10;
        n=n%10;

        int c5=n/5;
        n=n%5;

        int c2=n/2;
        n=n%2;

        int c1=n/1;
        n=n%1;

        int f = c100+c50+c20+c10+c5+c2+c1;
        System.out.println(f);
        

    }
}