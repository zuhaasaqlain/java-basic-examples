import java.util.function.BiPredicate;

public class BiPredicatesDemo {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> areEqual = (x, y) -> x.equals(y);
        System.out.println(areEqual.test(5, 5)); // Prints: true
    }

}
