public class Power {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int exp = Integer.parseInt(args[1]);
        // Calculate base*exp
        int result = 1;
        
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        System.out.println(base + "^" + exp + " = " + result);
    }
}
