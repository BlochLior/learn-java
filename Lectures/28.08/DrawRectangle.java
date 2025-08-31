public class DrawRectangle {
    public static void main(String[] args) {
        // Get user's input
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        int row = 0;
        int col = 0;

        // draw rows:
        while (row < height) {
            // draw single row
            col = 0;
            while (col < width) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
        /*
         * or with for-loops - 
         * just use the example from the mult table and translate it
         */
    }
}
