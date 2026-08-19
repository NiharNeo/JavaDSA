package DAY3.SESSION2;

class home{
    interface window{
        void  opens();
    }
}

class app implements home.window{

    @Override
    public void opens(){
        System.out.println("Window is Open");

    }
}

public class NestedInterface {

    public static void main(String []args){
        home.window obj = new app();
        obj.opens();
    }
}
