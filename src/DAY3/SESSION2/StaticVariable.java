package DAY3.SESSION2;

class Bank{
    static int count=0;
    static String appName;

    // Static block
    static {
        appName="BankApp"; //Static block  Executes first even before th main function
    }

    static void  printCount(){

    }
}


public class StaticVariable {

    public static void main(String []args){
        //static int num =10;
        // Static variables cannot work inside the main function
    }

}
