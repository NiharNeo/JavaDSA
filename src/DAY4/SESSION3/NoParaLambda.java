package DAY4.SESSION3;


interface greet{
    void sayHello();
}

public class NoParaLambda {
    public static void main(String[] args){

        greet g = () -> System.out.println("Helloee");
        g.sayHello();

    }
}
