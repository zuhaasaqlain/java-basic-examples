public class Fibonacci1 {


    static int n1 = 0, n2 = 1, n3;
    int num = 4;

    static void printFib(int n) {
        if (n > 0) {
            n3 = n1 + n2; // 1 + 1 = 2
            n1 = n2; // 1
            n2 = n3; // 2

            System.out.print(" " + n3);
            printFib(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        int num = 30;
        printFib(num - 2);
        Factorial fact = new Factorial();
        System.out.println(fact.number2);
        System.out.println(Factorial.number);

    }
}
