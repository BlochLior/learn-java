class Exercise144 {
    public static void main(String[] args) {
        double x = 4.4, y = 5.5, z = 15;
        boolean cond1 = (x + y) > z;
        boolean cond2 = (x + z) > y;
        boolean cond3 = (y + z) > x;
        if (cond1 && cond2 && cond3) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }
}