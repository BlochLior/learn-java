public class MultiplicationTable {
    public static void main(String[] args) {
        // Nested for-loop example
        // 10 * 10 multiplication table:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + " "); // Print an element
            }
            System.out.println(); // Go to next line
        }
    }
}
