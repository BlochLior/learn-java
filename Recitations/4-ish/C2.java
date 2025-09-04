public class C2 {
    /*
     * C2. Fibonacci up to n.
     * Print the Fibonacci sequence starting at 1, 1 until the next term would exceed n.
     */
    public static int fiboNext(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = fiboNext(a, b);
        while (true) {
            if (c > n) {
                return;
            } 
            System.out.println(c);
            a = b;
            b = c;
            c = fiboNext(a, b);
        }
    }
}
