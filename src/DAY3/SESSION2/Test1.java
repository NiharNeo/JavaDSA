package DAY3.SESSION2;

import java.util.Scanner;

class currnt_bill{

    double cal(double wats , double hrs){
        return ((wats*hrs)/1000 * (1.5));
    }
}

class fan extends currnt_bill{

    double fan(double wats , double hrs){

        return cal(wats,hrs);
    }


}

class light extends currnt_bill{


    double light(double wats , double hrs){
        return cal(wats,hrs);
    }

}
class tv extends currnt_bill{


    double tv(double wats , double hrs){
       return  cal(wats,hrs);
    }

}



public class Test1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double count =0.0;

        double wats = sc.nextInt();
        double hrs = sc.nextInt();
        fan f = new fan();
        count+= f.fan(wats,hrs);

        double watst = sc.nextInt();
        double hrst = sc.nextInt();
        tv t = new tv();
        count+=t.tv(watst,hrst);


        double watsl = sc.nextInt();
        double hrsl = sc.nextInt();
        light l = new light();
        count+=l.light(watsl,hrsl);

        System.out.println(count);

    }
}
