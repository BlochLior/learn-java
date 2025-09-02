public class Exercise316 {
    public static void main(String[] args) {
        /*
         * Use a for loop to draw the following shape: 
         *  54321 12345 
         *  4321   1234 
         *  321     123 
         *  21       12 
         *  1         1  
         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Left side: "54321"(n - 1) "4321"(n-1 - 1) "321"
            for (int b = n - i; b > 0; b--) {
                System.out.print(b);
            }
            // whitespace middle: 1, 3, 5, 7, 9
            for (int a = 0; a < 2*(i + 1); a++) {
                System.out.print(" ");
            }       

            // right side: "12345" "1234" "123"
            for (int c = 1; c <= n - i; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
