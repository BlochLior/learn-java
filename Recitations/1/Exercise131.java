class Exercise131 {
    public static void main(String[] args) {
        // Given an integer in the range 10-99, print its first and last digits.
        int integer = 99;
        int ones = integer % 10;
        int tens = integer / 10;
        System.out.println("ones: " + ones);
        System.out.println("tens: " + tens);
    }
}