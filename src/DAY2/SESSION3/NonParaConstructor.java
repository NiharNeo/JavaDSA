package DAY2.SESSION3;


class Book{

    String title;
    double price;

    Book(){
        this.title="Fire and Blood";
        this.price = 200.0 ;
    }
}

public class NonParaConstructor {

    public static void main(String[] args){

        Book b = new Book();
        System.out.println("Title: " + b.title );
        System.out.println("Price: "+b.price);
    }
}
