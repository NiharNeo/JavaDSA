package DAY2.SESSION3;

import org.w3c.dom.ls.LSParser;

class Laptop{
    String brand;
    int ram;

    public Laptop(String brand,int ram){
        this.brand=brand;
        this.ram=ram;
    }

    public Laptop(Laptop obj){
        this.brand=obj.brand;
        this.ram=obj.ram;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {


        Laptop ori = new Laptop("Dell" , 16);
        Laptop copy = new Laptop(ori);
        System.out.println(copy.brand + " " + copy.ram);
    }
}
