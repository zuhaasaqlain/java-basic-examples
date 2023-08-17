public class JavaImmutableMutable {
    public static void main(String[] args) {
        String name = "doha";
        name = name + "queen";
        System.out.println("Hello " + name);
        String s1 = "Doha";
        String s2 = "Doha";

        System.out.println(s1 == s2);

    }
}
