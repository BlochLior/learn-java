public class Exercise242 {
    public static void main(String[] args) {
        /*
         * Write a Java program that prints 1 through n in square brackets. 
         * Your program must receive ‘n’ as an argument. 
         * For example, if n = 6, print: [1] [2] [3] [4] [5] [6] 
         */
        int num1 = Integer.parseInt(args[0]);
        int i = 1;
        while (i <= num1) {
            String str = "[" + i + "]";
            System.out.print(str + " ");
            i++;
        }
        System.out.println("");
    }
}
