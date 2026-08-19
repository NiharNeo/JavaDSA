package DAY3.SESSION1;

// Function Overloading


class cal{

    int add(int a , int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args){

        cal c = new cal();
        System.out.println(c.add(5,8));
        System.out.println(c.add(2.4,7.6));


    }
}
