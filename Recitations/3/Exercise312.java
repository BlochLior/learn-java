public class Exercise312 {
    public static void main(String[] args) {
        /*
         * Use a for loop to draw a square in which every line is made of the line number. In particular, 
         * given an input n, the output should be an n x n square in the form described below.  
         * (Clarification, n should be set in main, rather than be given as a command-line argument.)  
         * For example, for n = 5, the following will be outputted to the screen:  
         *  1 1 1 1 1 
         *  2 2 2 2 2 
         *  3 3 3 3 3 
         *  4 4 4 4 4 
         *  5 5 5 5 5 
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";
            for (int j = 1; j <= n; j++) {
                row += i + " ";
            }
            System.out.println(row);
        }
    }
}
