class Exercise215 {
    public static void main(String[] args) {
        /*
         * A class starts at 8:45 and ends at 11:15. 
         * Write a program to calculate the time you spend in class. 
         * The program prints to the screen the following: 
         * “The class is HH hours and MM minutes long.” 
         * 
         * Implicitly in my approach:
         * 1. a class is less then a day
         * 2. both hours start and end are 24-hr coded
         * 3. the class doesn't cross between midnight and the next date
         * 4. the start time is before the end time
         */
        int hourStart = 8;
        int minStart = 45;
        int hourEnd = 11;
        int minEnd = 15;

        String printStart = "The class is ";
        String printEnd = "long.";
        String minutesSection = "and 1 minute ";
        int minutesValue;
        boolean condNoMinutes = minStart - minEnd == 0;
        boolean hourReduce = minEnd - minStart < 0;
        if (condNoMinutes) {
            minutesSection = "and 0 minutes ";
        } else if (minEnd - minStart != 1 || minEnd - minStart != -1) {
            minutesValue = minEnd - minStart;
            if (hourReduce) {
                minutesValue = -minutesValue;
            } 
            minutesSection = "and " + minutesValue + " minutes "; 
        }

        String hoursSection = "1 hour ";
        int hoursValue;
        boolean condNoHours = hourStart == hourEnd;
        if (condNoHours) {
            hoursSection = "0 hours ";
        } else if (hourEnd - hourStart !=1) {
            hoursValue = hourEnd - hourStart;
            if (hourReduce) {
                hoursValue -= 1;
                if (hoursValue == 0) {
                    hoursSection = "0 hours ";
                } else if (hoursValue == 1) {
                    hoursSection = "1 hour ";
                } else {
                    hoursSection = "" + hoursValue + " hours ";
                }
            } else {
                hoursSection = "" + hoursValue + " hours ";
            }
        } 
        String printStatement = printStart + hoursSection + minutesSection + printEnd;
        
        System.out.println(printStatement);
    }
}