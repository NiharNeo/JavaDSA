package DAY3.SESSION2;

abstract class bank{
    String name;
    double balance;

    public bank(String name, double balance){
        this.name=name;
        this.balance=balance;
    }

    // Abstract Method

    abstract void display();

    //Concrete Method
    void  deposite(double amount){
        balance+=amount;
        System.out.println(name + " : " + balance );
    }
}

class Savings extends  bank{

    public Savings(String name, double balace){
        super(name , balace);
    }

    @Override
    void display(){

    }
}

public class AbstractClass {

    public static void main(){
        //bank b = new bank();
        bank b = new Savings("Nihar", 100);



    }

}

