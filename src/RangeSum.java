public class RangeSum {


    static int sum(int n1, int n2) { // 5 , 7

        if (n1 == n2) {
            return n1;

        } else if (n1 < n2)

            return n1 + sum(n1 + 1, n2);
        else
            return n1 + sum(n1 - 1, n2);

    }

    public static void main(String[] args) {
        System.out.println("sum = " + sum(6, 4));
    }
}
