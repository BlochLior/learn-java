class Example3 {
    public static void main(String[] args) {
        // Nested if statements:
        int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);
        if (num1 != num2) {
            if (num1 > num2) {
                System.out.println(num1 + " is greater");
            } else {
            System.out.println(num2 + " is greater");
            }
        } else {
        System.out.println("the numbers are equal");
        }
    }
}