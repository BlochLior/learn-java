public class Exercise245 {
    public static void main(String[] args) {
        /*
         * Write a Java program that produces all numbers divisible by 3 in the range of min - max 
         * using a while loop. Your program must receive ‘min’ and ‘max’ as an argument, 
         * -- i decide to have it be inclusive of both min and max
         */
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int i = min;
        while (i <= max) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
