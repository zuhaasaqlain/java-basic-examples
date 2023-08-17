import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class HashTableMethod {
    public static void main(String[] args) {
//        Hashtable t = new Hashtable(); // capacity is 11 load factor 0.75 all will be shifted to new object
//        Hashtable ht = new (initial capacity )

        Hashtable<Integer ,String> t = new Hashtable<>();
        t.put(101, "Doha");
        t.put(102, "ahmed");

        System.out.println(t);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        System.out.println(t.get(101));
        System.out.println(t.remove(102));
        System.out.println(t);
        System.out.println(t.containsKey(102));
        System.out.println(t.containsValue("w"));
        System.out.println(t.isEmpty());
        System.out.println(t.keySet());
        System.out.println(t.values());
    }
}
