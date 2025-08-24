public class Example6 {
    public static void main(String[] args) {
        // factorial
        int num1 = Integer.parseInt(args[0]);
        if (num1 < 0) {
            System.out.println("factorial works only on natural positive numbers");
        } else {
            int result = 1;
            int factorial = num1;
            while (factorial > 0) {
                result *= factorial;
                factorial -= 1;
            } 
            System.out.println(num1 + "! = " + result);
        }
    }
}