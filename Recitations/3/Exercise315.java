public class Exercise315 {
    public static void main(String[] args) {
        /*
         * Given an integer n, use a for loop to draw a right-aligned triangle made of asterisks. 
         * (Clarification, n should be set in main, rather than be given as a command-line argument.)  
         * For n = 5, the program should print the following to the screen:  
                * 
               ** 
              *** 
             **** 
            ***** 
         */
        int n = 5;
        // n - 1 times print ws, 1 times print *; println
        // n - 2 times print ws, 2 times print *; println
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
