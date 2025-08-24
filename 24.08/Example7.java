class Example7 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The divisors of " + n + " are:");
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}