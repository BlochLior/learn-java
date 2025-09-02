public class Exercise322 {
    /*
     * Write a Java program that can print four types of smiley faces. The smiley will be printed 
     * according to the user’s choice (i.e., an integer 1 – 4) 
     * 1. Smiling [ :-) ] 
     * 2. Winking [ ;-) ] 
     * 3. Confused [ :-/ ] 
     * 4. Frowning [ :-( ]. 
     * Use a method called printSmiley(…) that receives as an argument an integer representing the 
     * type of smiley to be printed. 
     */
    public static void printSmiley(int smileyType) {
        if (smileyType == 1) {
            System.out.println(":-)");
        } else if (smileyType == 2) {
            System.out.println(";-)");
        } else if (smileyType == 3) {
            System.out.println(":-/");
        } else if (smileyType == 4) {
            System.out.println(":-(");
        } else {
            System.out.println("Invalid smiley type provided");
        }
    }
    public static void main(String[] args) {
        int smileyType = Integer.parseInt(args[0]);
        printSmiley(smileyType);
    }
}
