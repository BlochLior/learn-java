public class A1 {
    /*
     * A1. Print 1..n on one line.
     * Use a for loop to print the numbers 1 through n on a single line separated by spaces. 
     * Set n in main.
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
