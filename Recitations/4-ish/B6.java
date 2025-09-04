public class B6 {
    /*
     * B6. (BONUS) power(base, exp).
     * Write two methods to compute base^exp: one iterative, one recursive (assume exp ≥ 0).
     */
    public static int powerIteration(int initial, int base) {
        return initial * base;
    }
    public static int powerRecursion(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result = powerIteration(result, base);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(powerRecursion(2, 0));
        System.out.println(powerRecursion(5, 6));
    }
}
