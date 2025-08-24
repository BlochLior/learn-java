class Example5 {
    public static void main(String[] args) {
        // exponentiation with inputs
        // and with a loop
        int x = Integer.parseInt(args[0]);
        int power = 0;
        int result = 1;

        while (power < 10) {
            System.out.println(x + "^" + power + " = " + result);
            result *= x;
            power += 1;
        }
    }
}