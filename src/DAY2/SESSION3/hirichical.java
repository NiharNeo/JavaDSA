package DAY2.SESSION3;

class GrandFatherr{
    String name;
    void skill(){
        System.out.println("Story Telling");
    }
}

class Fatherr extends GrandFather{
    String name;
    void skill(){
        System.out.println("Ride");
    }
}

class sonr extends GrandFatherr{
    String name;
    void skill(){
        System.out.println("Sleeping");

    }
}


public class hirichical {
    public static void main(String[] args) {

        GrandFatherr g = new GrandFatherr();
        g.skill();

        Fatherr f = new Fatherr();
        f.skill();


        sonr s = new sonr();
        s.skill();


    }

}
