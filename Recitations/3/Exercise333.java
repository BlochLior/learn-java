public class Exercise333 {
    /*
     * Write a method that receives an integer 𝑖 representing an index and returns the 𝑖𝑡ℎ item in the 
     * Fibonacci sequence. Note that the first index is 0 and not 1. 
     */
    public static int nextFibonacciNum(int secondToLastNum, int lastNum) {
        return secondToLastNum + lastNum;
    }
    public static void main(String[] args) {
        int iter = Integer.parseInt(args[0]);
        if (iter == 0 || iter == 1) {
            System.out.println(1);
            return;
        }
        int a = 1;
        int b = 1;
        int fibo = nextFibonacciNum(a, b);
        for (int i = 2; i < iter; i++) {
            int tempA = a;
            int tempB = b;
            a = b;
            b = nextFibonacciNum(tempA, tempB);
            fibo = nextFibonacciNum(a, b);
        }
        System.out.println(fibo);
    }
}
