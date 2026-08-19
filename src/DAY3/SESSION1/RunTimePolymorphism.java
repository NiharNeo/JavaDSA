package DAY3.SESSION1;

// Function OverRiding

class Animal{
    void makeSound(){
        System.out.println("Makes Sound");
    }
}

class cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("cat meows");
    }
}

class dog extends  Animal{
    @Override
    void makeSound (){
        System.out.println("Dog barks");
    }
}

class rabbit extends Animal{
    @Override
    void makeSound() {
        System.out.println("Hopps");
    }
}


public class RunTimePolymorphism {

    public static void main(String[] args){

        cat c = new cat();
        c.makeSound();

        dog d = new dog();
        d.makeSound();

        rabbit r = new rabbit();
        r.makeSound();

    }
}
