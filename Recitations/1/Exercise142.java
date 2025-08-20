class Exercise142 {
    public static void main(String[] args) {
        /*
         * Given a number (integer): 
            •	If the number is outside of the range 0-100 inclusive, print "WOW".
            •	Otherwise, if it is a power of 10, print "SUCH POWER".
            •	Otherwise, if is a multiple of 7, print "MUCH LUCK".
            •	Otherwise, print "VERY CODE"
         */
        int number = 1;
        boolean conditionWow = (number < 0) || (number > 100);
        boolean conditionSuchPower = !conditionWow && ((number % 10) == 0);
        boolean conditionMuchLuck = !conditionSuchPower && ((number % 7) == 0);
        if (conditionWow) {
            System.out.println("WOW");
        } else if (conditionSuchPower) {
            System.out.println("SUCH POWER");
        } else if (conditionMuchLuck) {
            System.out.println("MUCH LUCK");
        } else {
            System.out.println("VERY CODE");
        }
    }
}