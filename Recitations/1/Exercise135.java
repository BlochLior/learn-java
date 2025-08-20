class Exercise135 {
    public static void main(String[] args) {
        /*
         * Write a Java program to convert a given number of seconds to a readable HH:mm:ss format.

         * Bonus: Convert fractions (e.g., 8765.43 seconds) to HH:mm:ss:uuu format,
         * where uuu is milliseconds.
         */
        double seconds = 8765.432;
        
        int hH = (int)seconds / 3600;
        String hHPart = "" + hH;

        int hoursInSeconds = 3600 * hH;
        int secondsWOHours = (int)(seconds) - hoursInSeconds;
        int mM = secondsWOHours / 60;
        String mMPart = ":" + mM;

        int minutesInSeconds = mM * 60;
        int secondsRemainder = secondsWOHours - minutesInSeconds;
        String secondsPart = ":" + secondsRemainder;

        int milliseconds = (int)((seconds - (int)seconds) * 1000);
        String msPart = ":" + milliseconds;

        String result = hHPart + mMPart + secondsPart + msPart;

        System.out.println(result);
    }
}
