package DAY6.SESSION1;

public class UncheckedExpections {
    public static void main(String[] args){

        try {
            int num = Integer.parseInt("abc");
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Number");
        }

    }
}
