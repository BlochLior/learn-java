public class Ordered {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        // Conditions to check:
        boolean ascend = (a<b) && (b<c);
        boolean descend = (a>b) && (b>c);
        // Print statement:
        System.out.println(ascend || descend);
    }
}