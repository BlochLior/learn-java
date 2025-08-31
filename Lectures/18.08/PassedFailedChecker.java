class PassedFailedChecker {
    public static void main(String[] args) {
        int grade = 98;
        int threshold = 60;

        if (grade >= threshold) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}