class Exercise223 {
    public static void main(String[] args) {
        /*
         * Given a 3 digit whole number (e.g., ‘int num = 123’): - print0
         * 1. Print the sum of all digits.  - print1
         * 2. Print the average of all digits (this could be of type ‘double’!). 
         * 3. Print the digit with the largest value of the number.  
         * 4. Print the digit with the middle value of the number.  
         * 5. Print the digit with the smallest value of the number.  
         * You may assume that all the digits are different from one another 
         * (i.e., a number such as ‘111’ will not be checked). 
         */
        int number = 123;
        int dig1 = number / 100;
        int dig2 = (number / 10) % 10;
        int dig3 = (number % 100) % 10;

        int digSum = dig1 + dig2 + dig3;
        String print0 = "The number is: " + number;
        String print1 = "" + digSum;
        double digAvg = ((double)dig1 + dig2 + dig3) / 3;
        String print2 = "" + digAvg;

        int largest, middle, smallest;
        largest = dig1;
        middle = dig2;
        smallest = dig3;
        if (dig2 > dig1 && dig2 > dig3) {
            largest = dig2;
            if (dig1 > dig3) {
                smallest = dig3;
                middle = dig1;
            } else {
                smallest = dig1;
                middle = dig3;
            }
        } else if (dig3 > dig1 && dig3 > dig2) {
            largest = dig3;
            if (dig2 > dig1) {
                middle = dig2;
                smallest = dig1;
            } else {
                middle = dig1;
                smallest = dig2;
            }
        }

        System.out.println(print0);
        System.out.println(print1);
        System.out.println(print2);
        System.out.println(largest);
        System.out.println(middle);
        System.out.println(smallest);
    }
}