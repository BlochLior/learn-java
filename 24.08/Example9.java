class Example9 {
    public static void main(String[] args) {
        // do - while loops
        // get user input
        int i = 0;
        int n;
        do {
            n = Integer.parseInt(args[i]);
            i++;
        } while (n < 0);

        System.out.println("The first non-negative number is: " + n);
    }
}