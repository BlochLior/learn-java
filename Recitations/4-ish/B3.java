public class B3 {
    /*
     * B3. isPrime(n).
     * Write a method boolean isPrime(int n). Use it to print all primes ≤ m (set m in main).
     */
    public static boolean isPrime(int n) {
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int m = 23;
        for (int i = 2; i <= m; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
