package DAY3.SESSION2;

interface A{
    void skill();

}

interface B{
    void skill2();
}

interface C extends A,B{
    void skill3();
}

class details implements C{
    @Override
    public void skill() {
        System.out.println("Riding");
    }

    @Override
    public void skill2(){
        System.out.println("Dancing");
    }

    @Override
    public void skill3() {
        System.out.println("Playing");
    }
}

public class MultipleIn {

    public static void main(String[]args){

        details d = new details();
        d.skill();
        d.skill2();
        d.skill3();

    }


}
