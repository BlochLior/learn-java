class Exercise233 {
    public static void main(String[] args) {
        /* 
         * Write a program that receives three inputs – 
         * a number, a mathematical operation, and another number 
         * (For simplicity's sake, you may use "+", "*", "-", "/" as the operations, 
         * and the numbers may be integers). 
         * The program parses the input, does the mathematical calculation, 
         * and prints the result. 
         * -- extend previous to include power - denoted with **;
         */
        // It is required here to denote the second argument inside ""
        int num1 = Integer.parseInt(args[0]);
        String op = args[1];
        int num2 = Integer.parseInt(args[2]);
        double value;

        String result = num1 + " " + op + " " + num2 + " = ";
        if (op.equals("+")) {
            value = num1 + num2;
            result += value;
            System.out.println(result);
        } else if (op.equals("-")) {
            value = num1 - num2;
            result += value;
            System.out.println(result);
        }  else if (op.equals("/")) {
            value = num1 / num2;
            result += value;
            System.out.println(result);
        } else if (op.equals("**")){
            int power = 0;
            double expoResult = 1;
            while (power < num2) {
                power++;
                expoResult *= num1;
            }
            result += expoResult;
            System.out.println(result);
        } else if (op.equals("*")) {
            value = num1 * num2;
            result += value;
            System.out.println(result);
        } else {
            result = "Invalid value for operator argument: " + op;
            System.out.println(result);
        }
    }
}