package DAY6.SESSION1;

class invalidMarks extends RuntimeException{
    public  invalidMarks(String msg){
        super(msg);
    }
}
public class UnCheckedCustomException {

    public static void markscheck(int marks){
        if(marks<0||marks>100){
            throw new invalidMarks("Invalid Marks");
        }
        System.out.println("Marks : "+ marks);
    }

    public static void main(String[] args){
        try {
            markscheck(100);
          //  markscheck(150);
        }
        catch (invalidMarks e){
            System.out.println(e.getMessage());
        }

        System.out.println("Continuess");
    }

}
