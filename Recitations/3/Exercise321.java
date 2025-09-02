public class Exercise321 {
    /*
     * Write a Java program that prints to the screen 10 rows of asterisk characters (*) in ascending 
    * order as follows:  
        *
        ** 
        *** 
        **** 
        ***** 
        ****** 
        ******* 
        ******** 
        ********* 
        **********  
    * To do so, use a method named printStarRow(...) that receives an integer and prints to the 
    * screen a corresponding number of asterisk characters. This function should be used 10 times 
    * (once per row). 
     */
    public static void printStarRow(int astNum) {
        for (int i = 0; i < astNum; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int iterNum = 10;
        for (int i = 1; i <= iterNum; i++) {
            printStarRow(i);
        }
    }
}
