package DAY2.SESSION3;


class A{
    String name;
    void skill(){
        System.out.println("Bike");
    }

}

class B extends A{

    String name;
    void skill() {
        System.out.println("Car");
    }
}

public class poly {
    public static void main(String []args){
        B b1 = new B();
        b1.skill();

        A a1 = new B();
        a1.skill();
    }
}
