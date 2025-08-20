public class AssignmentThree {
	public static void main(String[] args) {
        String name = "Lior Bloch";
		double height = 1.65; 	// Holds the author’s height in meters 
		int birthYear = 1999;
        char zero = '0';
        int birthMonth = 3;
        int birthDay = 24;
        char slash = '/';
        String sentenceOne = "Hi, my name is " + name;
        String sentenceTwo = "I was born in " + birthDay + slash + zero + birthMonth + slash + birthYear;
        String sentenceThree = "I am " + height + " meters tall";
        System.out.println(sentenceOne);
        System.out.println(sentenceTwo);
        System.out.println(sentenceThree);
	}
}
