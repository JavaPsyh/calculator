package psyh;

public class MathFunctions {
    public static int substract(int a, int b){
        return a-b;
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int multiply (int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        if (b == 0) {
            System.out.println("Divide on '0' is forbidden!");
            throw new ArithmeticException();
        }
        if (a%b!=0) Recognising.remainder = a % b;
        return a/b;
    }
}
