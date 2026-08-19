package DAY3.SESSION1;


class car{
    void sound(){
        System.out.println("Beep");
    }

}

class bmw extends car{
    void sound(){
        System.out.println("Bmw beep");
    }

    void speed(){
        System.out.println("145KM/H");
    }
}

public class downCasting {

    public static void main(String []args){
        car c = new bmw();
        //c.speed();

        bmw b = (bmw) c;
        b.speed();
    }
}
