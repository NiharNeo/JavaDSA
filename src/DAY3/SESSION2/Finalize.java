package DAY3.SESSION2;


import java.lang.classfile.instruction.ExceptionCatch;

public class Finalize {

    public static void main(String[] args){

        int i=0;
        try{
            int x='A'/i; // Complietime
            int y = 10/i; // Runtime
        }
        catch (ArithmeticException e ){
            System.out.println("Error Occured");
        }
        finally {
            System.out.println("fially block");
        }

    }
}
