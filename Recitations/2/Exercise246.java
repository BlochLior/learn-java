public class Exercise246 {
    public static void main(String[] args) {
        /*
         * Write a Java program that prints all the odd numbers up to n and the sum of them: 
         * Example: n = 9, prints: 
         * 1 3 5 7 9 
         * Sum = 25 
         * You must use a do-while loop! 
         */
        int num = Integer.parseInt(args[0]);
        int i = 1;
        int sum = 0;
        String print = "";
        do {
            if (i % 2 == 1) {
                print += i + " ";
                sum += i;
            }
            i++;
        } while (i <= num);
        System.out.println(print);
        System.out.println(sum);
    }
}
