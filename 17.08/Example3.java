class Example3 {
    public static void main(String[] args) {
        int x = 5;
        int result = 1;
        int power = 0;
        System.out.println(x + "^" + power + " = " + result);
        power += 1;
        result *= x;
        System.out.println(x + "^" + power + " = " + result);
        power += 1;
        result *= x;
        System.out.println(x + "^" + power + " = " + result);
    }
}