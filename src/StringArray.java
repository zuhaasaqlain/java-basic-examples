public class StringArray {


    public static void main(String[] args) {
        int n = 10;
        String str = String.valueOf(n);
        System.out.println(
                str
        );

        String str1 = new String("HELLO");
        String str2 = new String("HELLO");
        System.out.println(str1 == str2);
        System.out.println(str1.compareTo(str2));

    }
}
