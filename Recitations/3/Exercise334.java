public class Exercise334 {
    /*
     * A palindrome is a a word, phrase, or sequence that reads the same backward as forward. For 
    example, “racecar” and “nurses run” are palindromes but “house” is not.  
    For simplicity, we will only consider strings of a single word (i.e., you do not need to consider 
    cases such as “nurses run”). 

    

    Write a Java program that receives as a command-line argument a single string representing a 
    word and returns true if the word is a palindrome and false otherwise.  
    Note: The actual check should be done in a separate method.  
    Hint: Use str.length() to get the length of the string and str.charAt(i) to get the character at the ith 
    index of the string. 
     */
    public static boolean isPalindrome(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char charLeft = inputString.charAt(i);
            char charRight = inputString.charAt(inputString.length() - (i + 1));
            if (charLeft != charRight) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String printString = "String " + args[0] + " is ";
        if (isPalindrome(args[0])) {
            printString += "a palindrome";
        } else {
            printString += "not a palindrome";
        }
        System.out.println(printString);
    }
}
