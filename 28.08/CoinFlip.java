public class CoinFlip {
    public static void main(String[] args) {
        System.out.println("Flipping a coin...");

        double coin = Math.random();

        if (coin < 0.5) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}
