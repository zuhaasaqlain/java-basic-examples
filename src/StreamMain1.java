import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,34,2,3,4,34,56,5);

        List list2 = new ArrayList();
        list2.add(12);
        list2.add(14);
        list2.add(45);

        List<Integer> list3 = Arrays.asList(4,5,7,3,8,4);

        List<Integer> listEven = new ArrayList<>();

        for(Integer i : list1){
            if(i % 2 == 0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);

        Stream<Integer> stream = list1.stream();
        System.out.println(stream);
        List<Integer> newList = stream.filter(i -> i % 2 ==0).collect(Collectors.toList());
        System.out.println(newList);

    }
}
