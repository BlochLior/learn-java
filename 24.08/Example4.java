class Example4 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double pi = 3.14;

        if (radius > 0) {
            double area = pi * radius * radius;
            System.out.println("A = " + area);
        } else {
            System.out.println("radius should be positive");
        }
    }
}