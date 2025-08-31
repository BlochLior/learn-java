class Example2 {
    public static void main(String[] args) {
        int x = 2;
        // First option - no assigning of new variables
        System.out.println("Option 1:");
        System.out.println(x / x);
        System.out.println(x);
        System.out.println(x * x);
        // Second option - assigning a new result variable
        int result = 1;
        System.out.println("Option 2:");
        System.out.println(result);
        result *= x;
        System.out.println(result);
        result *= x;
        System.out.println(result);
    }
}