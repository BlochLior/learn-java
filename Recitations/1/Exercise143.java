class Exercise143 {
    public static void main(String[] args) {
        /*
         * Given 2 numbers:
         * If the two numbers are equal, print “they are equal”.
         * Otherwise, if one of them is bigger than the other, print the larger of the two numbers.
         */
        double num1 = 22;
        double num2 = 22.2;
        if (num1 == num2) {
            System.out.println("they are equal");
        } else {
            if (num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
            }
        }
    }
}