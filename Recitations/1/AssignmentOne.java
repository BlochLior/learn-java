public class AssignmentOne {
	public static void main(String[] args) {
		int number = 10; 
        int modHundred = number % 100;
        if (modHundred == 0 && number != 0) {
            System.out.println("3 digits");
        } else {
            if (number > 9) {
                System.out.println("2 digits");
            } else {
                System.out.println("1 digit");
            }
        }
	}
}
