public class overloadingClass {

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static double sum(double n1, int n2) {
        return n1 + n2;
    }

    public static float sum(int n1, float n2) {
        return n1 + n2;
    }

    public static float sum(float n1, float n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println("sum = " + sum(3.9f, 5.9f));
    }
}
