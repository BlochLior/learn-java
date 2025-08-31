class DayTranslator {
    public static void main(String[] args) {
        int dayNum = 8;
        if (dayNum<1 || dayNum>7) {
            System.out.println("Error: not a number fitting to a day");
        }else if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4) {
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
    }
}