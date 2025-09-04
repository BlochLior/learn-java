public class A2 {
    /*
     * A2. Sequence of squares.
     * Given n, print: 1^2 2^2 3^2 ... n^2 (just the numeric results).
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i*i + " ");
        }
        System.out.println();
    }
}
