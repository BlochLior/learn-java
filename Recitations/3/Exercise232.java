class Exercise232 {
    public static void main(String[] args) {
        /* 
         * Write a program that receives three inputs – 
         * a number, a mathematical operation, and another number 
         * (For simplicity's sake, you may use "+", "*", "-", "/" as the operations, 
         * and the numbers may be integers). 
         * The program parses the input, does the mathematical calculation, 
         * and prints the result. 
         */
        double num1 = Double.parseDouble(args[0]);
        String op = args[1];
        double num2 = Double.parseDouble(args[2]);

        String plusString = "+";
        String minusString = "-";
        String timesString = "*";
        String divideString = "/";
        boolean add = op.equals(plusString);
        boolean minus = op.equals(minusString);
        boolean multiply = op.equals(timesString);
        boolean divide = op.equals(divideString);
        double value;

        String result = num1 + " " + op + " " + num2 + " = ";
        if (add) {
            value = num1 + num2;
            result += value;
            System.out.println(result);
        } else if (minus) {
            value = num1 - num2;
            result += value;
            System.out.println(result);
        } else if (multiply) {
            value = num1 * num2;
            result += value;
            System.out.println(result);
        } else if (divide) {
            value = num1 / num2;
            result += value;
            System.out.println(result);
        } else {
            result = "Invalid value for operator argument: " + op;
            System.out.println(result);
        }
    }
}