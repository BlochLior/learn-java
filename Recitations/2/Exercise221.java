class Exercise221 {
    public static void main(String[] args) {
        /* 
         * In some country, a year which is divisible by 4 is an election year. 
         * For example, the years 8 and 2016 are election years, while the year 2017 is not.
         *  
         * In addition, only citizens who are 18 years or older are allowed to vote. 
         * 
         * Given a year and an age, print to the screen "Allowed" if it is an 
         * election year and the person is allowed to vote, 
         * and "Not allowed" otherwise.
         */
        int year = 2016;
        int citizenAge = 18;
        boolean condYear = year % 4 == 0;
        boolean condAge = citizenAge >= 18;
        if (condAge && condYear) {
            System.out.println("Allowed:");
            System.out.println("The year is divisible by 4: " + year + ",");
            System.out.println("and the citizen is an adult, aged: " + citizenAge);
        } else {
            if (!condYear && !condAge) {
                System.out.println("Not allowed:");
                System.out.println("The year is not divisible by 4: " + year + ",");
                System.out.println("and the citizen is not an adult, they are " + citizenAge
                + " years old.");
            } else if (condYear && !condAge) {
                System.out.println("Not allowed:");
                System.out.println("The year is divisible by 4: " + year + ",");
                System.out.println("but the citizen is not an adult, they are " + citizenAge
                + " years old.");
            } else { // (condAge && !condYear)
                System.out.println("Not allowed:");
                System.out.println("Although the citizen is an adult, aged: "+ citizenAge + ", ");
                System.out.println("the year is not divisible by 4: " + year);
            }
        }
    }
}