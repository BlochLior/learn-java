public class Exercise331 {
    /* 
     * Perfect number is a positive number that is equal to the sum of its proper divisors (i.e., the sum 
    of its positive divisors excluding the number itself).  
    For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which 
    means that 28 is a perfect number.  
    The sum of the proper divisors of 24, however, would be 1 + 2 + 3 + 4 + 6 + 8 + 12 = 36, which 
    means that 24 is not a perfect number. 

    Write a Java program that prints to the screen all the perfect numbers under 1000. 
    
    Use a method called isPrefectNumber(…) in your program. The method should receive as input 
    a number and return a boolean stating whether the number is a perfect number. 
     */
    public static boolean isPerfectNumber(int num) {
        int perfectSum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                perfectSum += i;
            }
        }
        if (perfectSum == num) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
