public class B2 {
    /*
     * B2. printEmoticon(type).
     * Write a method printEmoticon(int type) that prints one of four faces: 1:) 2:D 3:P 4:(
     */
    public static void printEmoticon(int type) {
        if (type == 1) {
            System.out.println(":)");
        } else if (type == 2) {
            System.out.println(":D");
        } else if (type == 3) {
            System.out.println(":P");
        } else {
            System.out.println(":(");
        }
    }
    public static void main(String[] args) {
        int type = (int)(Math.random() * 4 + 1);
        printEmoticon(type);
    }
}
