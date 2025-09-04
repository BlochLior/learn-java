public class A4 {
    /*
     * A4. Centered pyramid of asterisks.
     * Given n, print a pyramid with height n (last row width = 2n-1).
  * - n = 3; firstLn = n-1 ws, 2ndLn = n-2 ws; 
 *** astNum l1 = 1; 2nd row = 1 + 2;last row = 2n -1 
*****
     */
    
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            // Lines prints in outer
            
            // WS print loop at start:
            for (int a = 0; a < n - i - 1; a++) {
                System.out.print(" ");
            }

            // Ast loop:
            for (int j = 0; j < 2*i + 1; j++) {
                // 1(i=0), 3(i=1), 5(i=2), 7(i=3)... 2n - 1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
