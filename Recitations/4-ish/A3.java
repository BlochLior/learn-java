public class A3 {
    /*
     * A3. n×n checkerboard.
     * Print an n by n grid of alternating characters starting with '*', then '-', and so on. Example (n=5):
* - * - * 
- * - * -
* - * - * 
- * - * -
* - * - *
     */
    int n = 9;
    public static void main(String[] args) {
        int n = 10;
        char firstChar = '*';
        char secondChar = '-'; 
        for (int i = 0; i < n; i++) {
            if (i%2 == 1) {
                secondChar = '*';
                firstChar = '-';
            } else {
                secondChar = '-';
                firstChar = '*';
            }
            for (int j = 0; j < n; j++) {
                if (j%2 == 1) {
                    System.out.print(secondChar + " ");
                } else {
                    System.out.print(firstChar + " ");
                }
            }
            System.out.println();
        }
    }
}
