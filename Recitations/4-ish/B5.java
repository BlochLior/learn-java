public class B5 {
    /*
     * B5. digitalRoot(n).
     * modulo of 10 *digNum
     * Write sumDigits(int n) and digitalRoot(int n),
     * that repeatedly sum digits until a single digit remains. 123 / 10 = 12; 12/ 10 = 1;
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;

    }
    public static int digitalRoot(int n) {
        while (n > 9) {
            n = sumDigits(n);
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(12345));
    }
}
