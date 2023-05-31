
import java.util.Arrays;


public class TwoDimensionalArrayEx1 {
    public static void main(String[] args) {
        int[] n = new int[8];
        n[0] = 15;
        n[1] = 10;
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("array = " + arr1[3]);
        System.out.println("array = " + n[0] + n[1]);

        double[] array = new double[5];
        System.out.println(array[0]);
        boolean[] array1 = new boolean[6];
        System.out.println(array1[0]);

        String[] arr = new String[]{"Doha", "Saja", "Jana"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arrays = {1, 2, 3, 6};
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
            float avg = sum / arrays.length;
            System.out.println(avg);
        }

        int num = 2;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == num) {
                System.out.println("Found !");
            } else {
                System.out.println("Not Found !");
            }
        }

        char[] arr2 = new char[]{'a', 'b', 'c', 'e', 'f'};
        Arrays.sort(arr2);
        String str = new String(arr2, 2, 3);
        System.out.println(str);


    }
}
