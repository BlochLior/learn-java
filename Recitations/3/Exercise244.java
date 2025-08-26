public class Exercise244 {
    public static void main(String[] args) {
        /* 
         * Write a Java program that computes the sum of all the numbers between min and max and 
         * prints them to the screen.
         * For example, if min = 3 and max = 5, print 12 (because 3 + 4 + 5 = 12).
         * Note: 
         * 1. Your program must receive ‘min’ and ‘max’ as an argument, 
         * 2. You may assume that both ‘min’ and ‘max’ are positive, 
         * 3. You may assume that ‘max’ is larger than ‘min’.
         */
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int i = min;
        int result = 0;
        while (i <= max) {
            result += i;
            i++;
        }
        System.out.println(result);
    }
}
