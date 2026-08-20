package DAY4.SESSION2;

import java.util.*;
import java.util.LinkedHashSet;

public class SetExampl {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        Set<Integer> ls = new LinkedHashSet<>();
        SortedSet<Integer> ss = new TreeSet<>();


        s.add(1);
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<6;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s);
    }
}
