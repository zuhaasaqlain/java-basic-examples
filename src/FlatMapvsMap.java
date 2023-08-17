import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapvsMap {
    public static void main(String[] args) {
        List<Customer> customers = CustomerDatabase.getAll();

        System.out.println(customers);
        // one to one as one customer has only one email
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phones);

        List<Customer> id = customers.stream().filter(i -> i.getId() == 1 ).collect(Collectors.toList());
        System.out.println(id);

        Optional<Customer> customer = customers.stream()
                .filter(i -> i.getId() == 1)
                .findFirst();

        if (customer.isPresent()) {
            System.out.println(customer.get());
        } else {
            System.out.println("No customer found.");
        }


    }
}
