class Exercise132 {
    public static void main(String[] args) {
        // Write a Java program to calculate and print the average of any three variables. 
        int a, b, c;
        a = 43;
        b = 23;
        c = 34;
        double denominator = 3.0;
        double sum = a + b + c;
        double average = sum / denominator;
        System.out.println(
            "The average of: " 
            + a + ", " 
            + b + ", " 
            + c + " is: "
            + average
            );
    }
}