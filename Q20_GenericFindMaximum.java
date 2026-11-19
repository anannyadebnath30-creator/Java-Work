public class Q20_GenericFindMaximum {
    public static <T extends Comparable<T>> T findMaximum(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {12, 45, 7, 89, 32};
        Double[] decimals = {2.5, 9.8, 4.1, 7.6};
        String[] words = {"Apple", "Mango", "Banana"};

        System.out.println("Maximum integer = " + findMaximum(integers));
        System.out.println("Maximum floating-point number = " + findMaximum(decimals));
        System.out.println("Maximum string (alphabetically) = " + findMaximum(words));
    }
}
