package DAY4.SESSION2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRooster {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        String choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();
        while(!choice.equals("Exit")){
            if(choice.equals("ADD")){
                String s = sc.nextLine();
                arr.add(s);
                System.out.println("Rooster : " + arr);
            }

            if(choice.equals("Insert")){
                String s = sc.nextLine();
                int a = sc.nextInt();
                arr.add(a,s);
                System.out.println("After Insertion Rooster : " + arr);
            }

            if(choice.equals("Remove")){
                String s = sc.nextLine();
                arr.add(s);
                System.out.println("Rooster Aftr deletion: " + arr);
            }

            if(choice.equals("Contains")){
                String s = sc.nextLine();
               boolean b =  arr.contains(s);
                System.out.println("Rooster : " + b);
            }

            if(choice.equals("index")){
                String s = sc.nextLine();

                System.out.println("Rooster : " + arr.indexOf(s));
            }
        }
    }
}
