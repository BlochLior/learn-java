public class AssignmentFive {
	public static void main(String[] args) {
		// First section
		String word11 = "I";
		String word12 = "You";
		String word13 = "We";
		String word14 = "They";

		String word21 = "am";
		String word22 = "is";
		String word23 = "are";

		String word31 = "happy";
		String word32 = "sad";
		String word33 = "tired";
		String word34 = "thrilled!";

		// Second section
		int firstGroupChoice = 1;
		int secondGroupChoice = 1;
		int thirdGroupChoice = 1;

		String firstWord = word11, secondWord = word21, thirdWord = word31;
        if (firstGroupChoice == 2) {
            firstWord = word12;
        } else if (firstGroupChoice == 3) {
            firstWord = word13;
        } else if (firstGroupChoice == 4) {
            firstWord = word14;
        }

        if (secondGroupChoice == 2) {
            secondWord = word22;
        } else if (secondGroupChoice == 3) {
            secondWord = word23;
        }

        if (thirdGroupChoice == 2) {
            thirdWord = word32;
        } else if (thirdGroupChoice == 3) {
            thirdWord = word33;
        } else if (thirdGroupChoice == 4) {
            thirdWord = word34;
        }

        System.out.println(firstWord + " " + secondWord + " " + thirdWord);
	}
}
