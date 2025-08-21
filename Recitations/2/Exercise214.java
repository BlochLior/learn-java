class Exercise214 {
    public static void main(String[] args) {
        /*
         * Write a Java program to convert your height in centimeters to your height in meters.  
         * The program prints to the screen the following: “My height is MM meters and CC centimeters.”  
         * 
         * Example: 
         * For input 155cm the output is: “My height is 1 meters and 55 centimeters.” 
         */
        int height = 178;
        String printStatementStart = "My height is ";
        String metersSection = "1 meter and ";
        String metersUnit = " meters and ";
        int metersValue;
        if (height < 100) {
            metersSection = "";
        } else if (height >= 200) {
            metersValue = height / 100;
            metersSection = metersValue + metersUnit;
        }
        String cmSection = "0 centimeters.";
        int cmValue;
        if (height % 100 == 1) {
            cmSection = "1 centimeter.";
        } else if (height % 100 > 1) {
            cmValue = height % 100;
            cmSection = "" + cmValue + " centimeters.";
        }
        String sentance = printStatementStart + metersSection + cmSection;
        if (height <= 0) {
            sentance = "Invalid height value: height is positive";
        }
        System.out.println(sentance);        
    }
}