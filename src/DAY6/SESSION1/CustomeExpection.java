package DAY6.SESSION1;

class invalidAgeException extends Exception{
    public invalidAgeException(String message){
        super(message);
    }
}
public class CustomeExpection {
    static void customerRegister(int age)throws invalidAgeException{
        if(age<18){

        }

    }
    public static void main(String[] args){

        try{
            customerRegister(24);
        }
        catch (invalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Go to next page");

    }

}
