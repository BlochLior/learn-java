class Exercise231 {
    public static void main(String[] args) {
        /*
         * Write a Java program that receives a single number as an argument. - args[0]
         * The program will print out "true" if the number is greater than 100 
         * and divisible by 3. 
         * Otherwise, it should print out "false".
         */
        int number = Integer.parseInt(args[0]);
        boolean condition = number > 100 && number % 3 == 0;
        System.out.println(condition);
    }
}