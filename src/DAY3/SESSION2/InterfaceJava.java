package DAY3.SESSION2;


interface Animal2{
    void eat();
    default void sleep(){
        System.out.println();
    }

}

class Monkey implements Animal2{
    public void eat(){
        System.out.println("Eats Banana");
    }
    public void sleep(){
        System.out.println("Sleeps on a Tree");
    }
}

public class InterfaceJava {

}
