public class Exercise332 {
    /* 
     * The Fibonacci sequence is a sequence of integers where every number after the first two is the 
    sum of the two preceding ones:  
    1, 1, 2, 3, 5, 8, 13, 21, … 
    Write a Java program that receives a number as an input and prints the Fibonacci sequence, 
    stopping when the current number in the sequence is larger than the given input.  
     */
    public static int nextFibonacciNum(int secondToLastNum, int lastNum) {
        return secondToLastNum + lastNum;
    }
    public static void main(String[] args) {
        int numInput = Integer.parseInt(args[0]);
        int a = 1, b = 1;
        System.out.println(a);
        System.out.println(b);
        int nextFibo = nextFibonacciNum(a, b);
        while (nextFibo < numInput) {
            System.out.println(nextFibo);
            int tempA = a;
            int tempB = b;
            a = b;
            b = nextFibonacciNum(tempA, tempB);
            nextFibo = nextFibonacciNum(a, b);
        }
        
        
    }
}
