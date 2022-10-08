import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // numbers for test
        System.out.println(search(numbers, 2)); // 2 for test
    }
    private static boolean search(int[] numbers, int x) {
        return IntStream.of(numbers).anyMatch(p -> p == x);
    }
}
