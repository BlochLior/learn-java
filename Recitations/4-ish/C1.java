public class C1 {
    /*
     * C1. Perfect numbers under 1000.
     * Write isPerfect(n) and print all perfect numbers < 1000.
     */
    public static boolean isPerfect(int n) {
        int sumDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }
        if (sumDivisors == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int limit = 1000;
        for (int i = 2; i <= limit; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
