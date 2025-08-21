class Exercise212 {
    public static void main(String[] args) {
        // Write a program that print the fraction value of a double number. 
        // For example, for the input number = 12.3, the program should print 0.3. 
        double number = 12.3;
        int integer = (int)(number);
        double fracValue = number - integer;
        System.out.println(fracValue);
    }
}