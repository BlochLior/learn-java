public class A5 {
    /*
     * A5. Multiplication table n×n.
     * Print a neatly formatted multiplication table for 1..n (rows and columns).
     */
    public static void main(String[] args) {
        int n = 20;
        // lines in outer
        for (int i = 0; i < n; i++) {
            // columns in inner:
            for (int j = 0; j < n; j++) {
                System.out.print((i+1)*(j+1) + " ");
            }
            System.out.println();
        }
    }
}
