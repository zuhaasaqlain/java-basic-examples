public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


        int c = 20;
        int d= 30;

        c = c + d; //20 + 30 = 50
        d = c - d; //50-30 = 20
        c = c - d; // 50 - 20 = 30;

        System.out.println(c); // 30
        System.out.println(d); // 20
    }
}
