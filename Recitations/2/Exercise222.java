class Exercise222 {
    public static void main(String[] args) {
        /* 
         * Given a whole number:  
         * 1. Check if the number is even/odd and print the answer to the screen.  
         * 2. Print whether the number is bigger than 500.  
         * 3. Print whether the number is smaller than 400. 
         */
        int number = 500;
        boolean isOdd = number % 2 == 1;
        String print1 = "" + number + " is even";
        if (isOdd) {
            print1 = "" + number + " is odd";
        }

        boolean isMoreThen500 = number > 500;
        boolean is500 = number == 500;
        String print2 = "" + number + " < 500";
        if (isMoreThen500) {
            print2 = "" + number + " > 500";
        } else if (is500) {
            print2 = "" + number + " = 500";
        }

        boolean isLessThen400 = number < 400;
        boolean is400 = number == 400;
        String print3 = "" + number + " > 400";
        if (isLessThen400) {
            print3 = "" + number + " < 400";
        } else if (is400) {
            print3 = "" + number + " = 400";
        }
        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);
    }
}