import java.util.Scanner;

public class Recursive {
    static int count = 0;

    static int fun(int n) {
        if (n > 1) {
            return n * fun(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        fun(n);
    }
}
