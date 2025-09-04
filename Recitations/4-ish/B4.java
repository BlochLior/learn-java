public class B4 {
    /*
     * B4. countWords(s).
     * Write a method int countWords(String s) that returns the number of words separated by single spaces.
     */
    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String example = "let there be"; 
        System.out.println(countWords(example));
    }
}
