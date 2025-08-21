class Exercise213 {
    public static void main(String[] args) {
        /*
         * Write a program that prints:  
         * 1. The value of the sum of 2 double numbers  - print1 - double sum
         * 2. The sum calculation and the result - print2 - equation + result
         * 3. A message if the integer sum is odd or even.  - print3 - message only
         */
        double a = 11.2, b = 5.5; // print2
        double sum = a + b; // print1 + print2
        double oddOrEvenCheck = sum % 2;
        
        String print1, print2, print3;
        print1 = "The value of the summation is: " + sum;
        print2 = "" + a + " + " + b + " = " + sum;
        print3 = "Integer sum is odd";
        if (oddOrEvenCheck < 1) {
            print3 = "Integer sum is even";
        }

        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);
    }
}