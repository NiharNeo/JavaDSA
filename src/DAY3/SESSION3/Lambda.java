package DAY3.SESSION3;

interface Greeting {
    void sayHello();
}

public class Lambda {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello!");

        g.sayHello();
    }
}