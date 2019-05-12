package psyh;

public class Recognising {

    public static boolean bool = true;
    public static String a;
    public static String f;
    public static String b;
    public static int result;
    public static String answer;
    public static int remainder = 0;

    public static void recognizeFunction (String f) throws Exception {
        switch (f){
            case "-":
                result = MathFunctions.substract(recognizeNumber(a), recognizeNumber(b));
                break;
            case "+":
                result = MathFunctions.add(recognizeNumber(a), recognizeNumber(b));
                break;
            case "*":
                result = MathFunctions.multiply(recognizeNumber(a), recognizeNumber(b));
                break;
            case "/":
                result = MathFunctions.divide(recognizeNumber(a), recognizeNumber(b));
                break;
                default:
                    throw new Exception("Incorrect math function!");
        }
    }

    public static void splitter(String s) throws Exception {
        String[] sar = s.split(" ");
        if (sar.length>3) throw new Exception("Incorrect input data!");
        a=sar[0];
        f=sar[1];
        b=sar[2];
    }

    public static int recognizeNumber (String s){
        int n = 0;
        if (s != null){
            if (Converter.isInt(s)) n = Integer.parseInt(s); else n = Converter.toNumerical(s);}
        return n;
    }
}
