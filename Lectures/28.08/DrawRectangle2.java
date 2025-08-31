public class DrawRectangle2 {
    public static void drawLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void drawRectangle(int width, int height) {
        for(int i = 0; i < height; i++) {
            drawLine(width);
        }
    }
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        drawRectangle(width, height);
    }
}
