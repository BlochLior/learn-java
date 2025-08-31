public class CelsiusFarenheitConverter {
    // C * 9/5 + 32 = F
    public static double convertCelsiusToFarenheit(double c) {
        double f = (c * 9.0/5.0) + 32;
        return f;
    }
    
    public static double convertFarenheitToCelsius(double f) {
        return (f - 32) * 5.0/9.0;
    }

    public static void printMenu() {
        System.out.println("User menu:");
        System.out.println("1. F -> C conversion");
        System.out.println("2. C -> F conversion");
        System.out.println();
    }
    public static void main(String[] args) {
        // Present options menu
        printMenu();

        // get user choice and decide which op to make
        int option = Integer.parseInt(args[0]);
        if (option > 2 || option < 1) {
            System.out.println("Illegal choice.");
            return;
        }

        double temperature = Double.parseDouble(args[1]);

        // calculate
        double result = 0;
        String resultStr = "";

        if (option == 1) {
            result = convertFarenheitToCelsius(temperature);
            resultStr = temperature + "F = " + result + "C";
        } else {
            result = convertCelsiusToFarenheit(temperature);
            resultStr = temperature + "C = " + result + "F";
        }
        System.out.println(resultStr);
    }
}
