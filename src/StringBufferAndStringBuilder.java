public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Doha");
        System.out.println(sb.capacity()); // bites
        System.out.println(sb.length());
        sb.append("whatever");

        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.insert(0, "shit");
        System.out.println(sb);
    }
}
