package DAY2.SESSION2;

import java.util.Scanner;

class person{

    int balance;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

}

public class Encaplacution {

    public static void main(String []args ) {

        Scanner sc = new Scanner(System.in);
        person p1 = new person();

        p1.setBalance(1000);
        System.out.println(p1.getBalance());

    }



}
