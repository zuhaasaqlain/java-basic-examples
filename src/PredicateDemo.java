import java.security.Principal;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(30));
        System.out.println(p.test(3));

        Predicate<String> s = i -> (i.length() > 4);
        System.out.println(s.test("HELLO"));
        System.out.println(s.test("HI"));

        String[] names = {"Doha", "Saja", "Hodaifa", "Hamza", "Jana"};
        for (String name : names) {
            if (s.test(name)) {
                System.out.println(name);
            }
        }
    }
}
