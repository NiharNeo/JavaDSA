package DAY3.SESSION1;

class c1{

    int age;
    int id;
    c1(int age,int id){
        this.age=age;
        this.id=id;
    }
}

class c2 extends c1{

    c2(int age, int id) {
        super(age, id);
    }
}

public class ConstructorChaningInDiffClass {
    public static void main(String[] args){

    }
}
