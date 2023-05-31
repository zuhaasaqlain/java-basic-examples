import java.util.FormatterClosedException;

public class Factorial {

    static int number = 4;
    int number2 = 5;

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(new Factorial().number2);
        new Factorial().number2 = 3;
        int num = 6;
        System.out.println(number);
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);

        Fibonacci1 fib = new Fibonacci1();
        fib.num = 2;
        fib.n1 = 8; // 8

        System.out.println(fib.num
        ); // 2

        Fibonacci1 fibo = new Fibonacci1();

        System.out.println(fibo.n1); // 8
        System.out.println(fibo.num); // 4
    }

    public static long multiplyNumbers(int num) {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }
}
