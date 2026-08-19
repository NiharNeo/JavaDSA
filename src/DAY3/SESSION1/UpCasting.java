package DAY3.SESSION1;


class Animall{
    void makeSound(){
        System.out.println("Makes Sound");
    }
}

class catt extends Animall{
    @Override
    void makeSound(){
        System.out.println("cat meows");
    }

    void skill(){

        System.out.println("Scratch");
}

}

public class UpCasting {
    public static void main(String[] args) {
        Animall a = new catt();
        a.makeSound();
        //a.skill();
    }
}
