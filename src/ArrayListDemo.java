import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList ls = new ArrayList();
        ls.add("Doha");
        ls.add(5);
        System.out.println(ls);
        ls.isEmpty();
        ls.contains("Saqlain");
        ls.add(8);
        ls.remove(2);
        System.out.println(ls);

        // Create two lists
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Add elements to list2
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Use addAll() to add elements from list2 to list1
        list1.addAll(list2);

        // Now list1 contains all elements from list2
        System.out.println("list1: " + list1); // Output: list1: [1, 2, 3]
    }
}
