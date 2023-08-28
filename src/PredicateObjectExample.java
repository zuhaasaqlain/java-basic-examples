import java.util.function.Predicate;

class Employee {
    private int id;
    String name;
    Double salary;


    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}


public class PredicateObjectExample {
    public static void main(String[] args) {

        Employee employee = new Employee(123, "Sara", 45600.0);

        Predicate<Employee> p = e -> (e.name == "Sara" && e.salary < 4000.0);
        System.out.println(p.test(employee));
    }
}
