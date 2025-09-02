public class Exercise313 {
    public static void main(String[] args) {
        /*
         * Use a for loop to draw a triangle made of the column index. 
         * In particular, given an input n, the output should be a right triangle in the form described below.  
         * (Clarification, n should be set in main, rather than be given as a command-line argument.)  
         */
        int num = 5;
        String line = "";
        for (int i = 1; i <= num; i++) {
            line += i + " ";
            System.out.println(line);
        }
    }
}
