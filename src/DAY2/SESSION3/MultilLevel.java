package DAY2.SESSION3;

class GrandFather{
    String name;
    void skill(){
        System.out.println("Story Telling");
    }
}

class Father extends GrandFather{
    String name;
    void skill(){
        System.out.println("Ride");
    }
}

class son extends Father{
    String name;
    void skill(){
        System.out.println("Sleeping");

    }
}

public class MultilLevel {

    public static void main(String[] args){

        GrandFather g1 = new GrandFather();
        g1.skill();

        Father f1 = new Father ();
        f1.skill();


        son  s1 = new son();
        s1.skill();


    }

}
