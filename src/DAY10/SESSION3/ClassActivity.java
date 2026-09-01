package DAY10.SESSION3;

import java.util.Arrays;

public class ClassActivity {



    public static void main(){

        String s1 = "openai";

        char [] arr = s1.toCharArray();

        Arrays.sort(arr);

        String s2 = new String(arr);
        System.out.println(arr);

    }
}
