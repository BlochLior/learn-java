public class Exercise241 {
    public static void main(String[] args) {
        /*
         * Write a program that printlns the following sequence:
         * 8, 11, 14, 17, 20, 23
         */
        int i = 0;
        int num = 8;
        while (i < 6) {
            System.out.println(num);
            i++;
            num += 3;
        }
    }
}
