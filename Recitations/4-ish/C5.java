public class C5 {
    /*
     * C5. Collatz sequence.
     * Given start > 1, print the Collatz sequence and the number of steps to reach 1.
     * 
     * if the number is even, divide it by two; if the number is odd, triple it and add one
     */
    public static int collatzSeq(int n) {
        if (n % 2 == 0) {
            n /= 2;
            return n;
        }
        n = (n * 3) + 1;
        return n;
    }
    public static void main(String[] args) {
        int n = 15;
        while (true) {
            if (n == 1) {
                System.out.println(n);
                return;
            } else {
                System.out.println(n);
                n = collatzSeq(n);
            }
        }
    }
}
