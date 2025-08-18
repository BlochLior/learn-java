public class LinearEq {
    public static void main(String[] args) {
        int a = 27;
        int b = 18;
        int c = 19;
        String equation = a + "x + " + b + " = " + c;
        System.out.println(equation);
        double x = (c - b) / (double)a;
        System.out.println("x = " + x);
    }
}