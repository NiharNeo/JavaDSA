package DAY3.SESSION3;

interface Printable { }

class Student implements Printable { }

public class Marker {
    public static void main(String[] args) {
        Student s = new Student();

        if (s instanceof Printable) {
            System.out.println("Printable object");
        }
    }
}