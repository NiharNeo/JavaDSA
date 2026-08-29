package DAY9.SESSION2;

public class StringFunctions {
    public static void main(){
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder ssb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Beautiful");

        ssb.replace(0,2,"WI");
        System.out.println(String.valueOf(sb.reverse()));
        ssb.delete(3,4);
        System.out.printf(String.valueOf(sb.reverse()));
    }
}
