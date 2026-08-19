package DAY3.SESSION1;


class Student{
    Student(int age , String name){
        System.out.println(age +" "+ name);
    }

    Student(int age , int id , long dob){
        System.out.println(age);
        System.out.println(id);
        System.out.println(dob);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args){
        Student s1 = new Student(19,"Nihar");
        Student s2 = new Student(19 ,63 , 25102006);
    }
}
