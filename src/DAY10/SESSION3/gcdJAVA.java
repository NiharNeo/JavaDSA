package DAY10.SESSION3;

public class gcdJAVA {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 48, num2 = 18;
        System.out.println("GCD: " + findGCD(num1, num2));
    }
}
