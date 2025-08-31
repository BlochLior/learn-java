class Example8 {
    public static void main(String[] args) {
        // Get user's input
        int i = 0;
        int n = Integer.parseInt(args[i]);
        // Look for the first non-negative number
        while (n < 0) {
            i++;
            System.out.println(n + " is negative");
            n = Integer.parseInt(args[i]);
        }
        System.out.println("The first non-negative number is: " + n);
    }
}