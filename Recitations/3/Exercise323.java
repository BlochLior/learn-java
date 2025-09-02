public class Exercise323 {
    /*
     * Write a function that receives as input an integer number, and returns true if the number is 
     * prime and false otherwise. 
     * Then, using the previous function, write a program that prints all the prime numbers between 2 
     * and an integer number (which is given as a command line argument). 
     */
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int userNum = Integer.parseInt(args[0]);
        if (userNum < 2) {
            System.out.println("Invalid argument - number provided is less then 2");
            return;
        } 
        for (int i = 2; i < userNum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
