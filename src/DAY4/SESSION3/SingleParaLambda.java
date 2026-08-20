package DAY4.SESSION3;
@FunctionalInterface
interface Greet2{
    void sayHello(String name);
}


public class SingleParaLambda {
    public static void main(String[] args){
        Greet2 g =(name) -> System.out.println("Helewww " + name);
        g.sayHello("Nihar");
    }
}
