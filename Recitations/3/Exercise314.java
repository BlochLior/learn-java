public class Exercise314 {
    
    public static String joinArrayToString(int[] arr, int stopIdx) {
        String returnString = "";
        for (int i = 0; i < stopIdx; i++) {
            returnString += arr[i] + " ";
        }
        return returnString;
    }
    public static void main(String[] args) {
        /*
         * Use a for loop to draw an upside-down right triangle made of the column index. 
         * (Clarification, n should be set in main, rather than be given as a command-line argument.)  
         */
        int n = 5;
        int[] nArray = new int[n];

        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = i + 1;
        }

        for (int j = n; j > 0; j--) {
            String printString = joinArrayToString(nArray, j);
            System.out.println(printString);
        }
        
    }
}
