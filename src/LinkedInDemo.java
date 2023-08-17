import java.util.*;

public class LinkedInDemo {
    public static void main(String[] args) {

        // Create two linked lists
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        // Add elements to linkedList2
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        linkedList2.add(4);
        linkedList2.remove(1);
        linkedList2.add(2, 7);
        System.out.println("linkedList2: " + linkedList2);
        linkedList2.set(0,0);

        // Use addAll() to add elements from linkedList2 to linkedList1
        linkedList1.addAll(linkedList2);

        // Now linkedList1 contains all elements from linkedList2
        System.out.println("linkedList1: " + linkedList1);

        linkedList2.contains(3);

        for(int i = 0 ; i < linkedList2.size() ; i++  ){
            System.out.print(linkedList1.get(i));
        }

        for(Object e: linkedList2){
            System.out.print(e);
        }

        Iterator it = linkedList2.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}
