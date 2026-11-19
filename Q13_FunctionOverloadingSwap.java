public class Q13_FunctionOverloadingSwap {
    static void swap(int a, int b) {
        System.out.println("Before swap (int): a=" + a + ", b=" + b);
        int temp = a; a = b; b = temp;
        System.out.println("After swap (int): a=" + a + ", b=" + b);
    }

    static void swap(float a, float b) {
        System.out.println("Before swap (float): a=" + a + ", b=" + b);
        float temp = a; a = b; b = temp;
        System.out.println("After swap (float): a=" + a + ", b=" + b);
    }

    static void swap(char a, char b) {
        System.out.println("Before swap (char): a=" + a + ", b=" + b);
        char temp = a; a = b; b = temp;
        System.out.println("After swap (char): a=" + a + ", b=" + b);
    }

    public static void main(String[] args) {
        swap(10, 20);
        swap(1.5f, 2.5f);
        swap('A', 'B');
    }
}
