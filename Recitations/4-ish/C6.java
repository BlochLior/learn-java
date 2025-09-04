public class C6 {
    /*
     * C6. (BONUS) Armstrong numbers 1..999.
     * Print all 3-digit Armstrong numbers (sum of cubes of digits equals the number).
     */
    public static boolean isArmstrongNumber(int n) {
        int hundreds = (int)(n / 100);
        int tens = (int)((n / 10) % 10);
        int ones = n % 10;
        int[] digits = {hundreds, tens, ones};
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 3);
        }
        if (sum == n) {
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
