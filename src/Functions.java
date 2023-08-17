import java.util.Scanner;

public class Functions {

    // for each loop
    public static int multiply(int... n) {
        int s = 0;
        for (int i : n) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 6, 8, 3, 4, 3));

    }
}
