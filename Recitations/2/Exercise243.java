public class Exercise243 {
    public static void main(String[] args) {
        /*
         * Write a Java program that prints 1 through n in square brackets. Your program must receive ‘n’ 
         * as an argument. 
         * For example, if n = 6, print [6] [5] [4] [3] [2] [1]
         */
        int num1 = Integer.parseInt(args[0]);
        int i = num1;
        while (i > 0) {
            String str = "[" + i + "]";
            System.out.print(str + " ");
            i--;
        }
        System.out.println("");
    }
}
