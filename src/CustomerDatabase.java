import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(1, "David", "d@gmail.com", Arrays.asList("123456", "345678")),
                new Customer(2, "John", "d@gmail.com", Arrays.asList("123456", "345678")),
                new Customer(3, "Doha", "d@gmail.com", Arrays.asList("123456", "345678"))
        ).collect(Collectors.toList());
    }
}
