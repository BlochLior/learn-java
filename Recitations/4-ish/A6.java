public class A6 {
    /*
     * A6. (BONUS) Hollow rectangle.
     * Given width w and height h, print a hollow rectangle made of '#'.
     */

    public static void main(String[] args) {
        int w = 10; // width - numColumns
        int h = 5; // height - numLines
        
        

        // print lines / height on 'i':
        for (int i = 0; i < h; i++) {
            // print columns  - width on 'j':
            for (int j = 0; j < w; j++) {
                // print '#' when:
                    // 1. i = 0
                    // 2. j = 0
                    // 3. i = h-1
                    // 4. j = w-1
                boolean iCases = i == 0 || i == h-1;
                boolean jCases = j == 0 || j == w-1;
                boolean shouldPrintHash = iCases || jCases;
                if (shouldPrintHash) {
                    System.out.print("" + "#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
