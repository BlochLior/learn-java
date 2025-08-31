class ModuloExample1 {
    public static void main(String[] args) {
        int num = 123;
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
    }
}