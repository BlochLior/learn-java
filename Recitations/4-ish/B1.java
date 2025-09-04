public class B1 {
    /*
     * B1. printLine(ch, count).
     * Write a method printLine(char ch, int count) that prints the character ch repeated count times on one line. Use it to 
     * print 10 lines of increasing length.
     */
    public static void printLine(char ch, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLine('^', 4);
    }
}
