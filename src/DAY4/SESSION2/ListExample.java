package DAY4.SESSION2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


// List
// Interface which stores orderd collection of elements but Dynamic
// Allows duplicate,null

public class ListExample {

    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        List<String> num = new ArrayList<>();
        names.add("Nihar");
        names.add("Neo");
        names.add("Pooja");


        System.out.println(names);

        names.remove("Pooja");
        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }
        names.set(1,"Kevin");
        System.out.println(names.get(1));
        System.out.println(names);
        System.out.println(String.valueOf(names.contains("Neo")));
        System.out.println(String.valueOf(names.size()));
        System.out.println(String.valueOf(num.isEmpty()));


        List<String> l1 = new LinkedList<>();
    }


}

//add()
// remove()
// get()
// set()
// contains()
//size()
//isEmpty()
