public class PassingMethodsToArrays {

    static void print(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    static int[] getArray() {
        return new int[]{1, 2, 3, 4};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        print(arr);

        int x[] = new int[]{5, 6, 7, 8, 9};
        print(x);

        int array[] = getArray();

        int arr1[] = {20, 12, 12};
        int[] arr2 = new int[]{40, 50, 60};
        arr1 = arr2;
        arr2[0] = 100;
        System.out.println(arr1[0]+ " "+ arr1[1] + " " + arr1[2]);

    }
}
