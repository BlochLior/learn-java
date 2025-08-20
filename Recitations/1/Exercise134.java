class Exercise134 {
    public static void main(String[] args) {
        // Write a Java program to find the sum of the digits of a four-digit number.
        int number = 1234;
        int dig_1 = (number / 1000) % 10;
        int dig_2 = (number / 100) % 10;
        int dig_3 = (number / 10) % 10;
        int dig_4 = number % 10; 
        int digSum = dig_1 + dig_2 + dig_3 + dig_4;
        System.out.println(
            "The sum of " + dig_1 
            + ", " + dig_2
            + ", " + dig_3
            + ", " + dig_4
            + " is: " + digSum
            );
    }
}