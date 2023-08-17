import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;


public class ReverseString {
    public static void main(String[] args) {
        String str = "Happy independence day";
        String reversed = str.chars()
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join("", list);
                        }));

        System.out.println(reversed);

        String reversedSentence  = Arrays.stream(str.split("  "))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return String.join("", list);
                        }));

        System.out.println(reversedSentence);

    }
}
