

@FunctionalInterface
interface myFunction {
    public void  add(int a , int b);
}

public class Test {
    public static void main(String[] args) {
           myFunction f = (a, b) -> System.out.println(a + b);
           f.add(3,7);
    }
}
