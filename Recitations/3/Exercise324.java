public class Exercise324 {
    /*
     * Write a Java program that prints the number of words in a given string passed as a command-
    line argument. The counting of words should be done in a separate method which receives as 
    input a String and outputs an integer representing the number of words in the given string.  

    

    Hint: Use str.charAt(i) == ‘ ‘ to check if the character at the ith index in the string str is a space.  
    Note: Assume that the last word is not followed by a space.  

    

    Example: 
    > java Assignment 5 “The quick brown fox jumps over the lazy dog” 
    Number of words in the string: 9 
     */
    public static int wordsCounter(String inputString) {
        int count = 1;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = args[0];
        System.out.println(wordsCounter(input));
    }
}
