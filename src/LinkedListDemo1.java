import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        LinkedList ls = new LinkedList();
        ls.addAll(l);

        System.out.println(l);
        System.out.println(ls);


        ls.removeAll(l);
        System.out.println(l);
        System.out.println(ls);

        Collections.sort(l);
        System.out.println(l);
        System.out.println(ls);
    }
}
