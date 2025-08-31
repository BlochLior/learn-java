public class MonthConverter {
    public static void main(String[] args) {
        String[] months = {"", "January", "February", "March", "April"
        , "May", "June", "July", "August", "September", "October"
        , "November", "December"};

        int numberedMonth = Integer.parseInt(args[0]);

        if (numberedMonth > 12 || numberedMonth < 1) {
            System.out.println("This number doesn't match any month");
            return;
        }

        System.out.println("Month number " + numberedMonth + " is: " + months[numberedMonth]);
    }
}
