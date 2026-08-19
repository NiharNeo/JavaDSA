package DAY2.SESSION1;

 class Maths{
     public int add(int a,int b){
         return a+b;
     }
     public int sub(int a,int b){
         return a-b;
     }
     public int mul(int a,int b){
         return a*b;
     }
     public int div(int a,int b){
         return a/b;
     }

}

public class JavaClass {

     public static void main(String []args){
         int a=20;
         int b=10;

         Maths m1 = new Maths();

         System.out.println(m1.sub(a,b));
         System.out.println(m1.add(a,b));
         System.out.println(m1.mul(a,b));
         System.out.println(m1.div(a,b));
     }
}
