class ModuloExample2 {
    public static void main(String[] args) {
        int num = 12345;
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        int thousands = (num / 1000) % 10;
        int tensThousands = (num/10000) % 10;
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
        System.out.println(thousands);
        System.out.println(tensThousands);
    }
}