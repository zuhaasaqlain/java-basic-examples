import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer , String> m = new HashMap();
        m.put(101 , "John");
        m.put(102, "David");
        m.put(103, "ashly");
        m.put(104, "sara");
        m.put(105, "sara");

        System.out.println("hashmap " + m);
        System.out.println(m.get(101));
        System.out.println(m.isEmpty());
        System.out.println(m.size());
        System.out.println(m.containsKey(107));
        System.out.println(m.containsValue("ashly"));
        System.out.println(m.remove(105));
        System.out.println(m.values());
        System.out.println(m.keySet());
        System.out.println(m.entrySet());

        for(Object i:m.values()){
            System.out.println(i);
        }

        for(Object i:m.keySet()){
            System.out.println(" values :" + m.get(i));
        }

//        for (Map.Entry() entry:m.entrySet()){
//            System.out.println(entry.getKey() + "" + entry.getValue());
//        }


    }
}
