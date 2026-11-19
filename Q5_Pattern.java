public class Q5_Pattern {
    public static void main(String[] args) {
        // The pattern image was not attached, so this sample prints a star triangle.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
