package DAY3.SESSION3;

import java.util.Scanner;

class Account{

    String name;
    int num;
    double balance;
    String SD;
    int year;



}

interface MaintenanceCharge{
    double CA(int n);
    double SA(int n);

}

abstract class CurrentAccount extends Account implements MaintenanceCharge{

    @Override
    public double CA(int n) {

        return (100*n)+200;


    }
}

 abstract class SavingsAccount extends Account implements MaintenanceCharge{

    @Override
    public double SA(int n) {



        return (2*50*n)+50;
    }
}


public class BankMaintance {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");
        int val = sc.nextInt();


        System.out.println("Name : ");
        String Ac;
        Ac = sc.nextLine();

        System.out.println("Account Balance");
        String Ab;
        Ab = sc.nextLine();

        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        String sy;
        sy=sc.nextLine();

        System.out.println("Enter the years");
        int n = sc.nextInt();

        CurrentAccount c1 = new CurrentAccount() {
            @Override
            public double SA(int n) {
                return (100*n)+200;
            }
        };

        SavingsAccount s1 = new SavingsAccount() {
            @Override
            public double CA(int n) {
                return (2*50*n)+50;
            }
        };


        if(val==1){
            System.out.println(c1.CA(n));
        }
        else{
            System.out.println(s1.SA(n));

        }


    }
}
