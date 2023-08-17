public class MultiDimensionsArray {

    static int[][] get2dArray(){
        int[][] ar = new int[2][2];
        return ar;
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[2];
        arr[2] = new int[2];

        arr[0][0] = 00;
        arr[0][1] = 01;

        arr[1][0] = 10;
        arr[1][1] = 11;

        arr[2][0] = 20;
        arr[2][1] = 21;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(arr[i][j]);
            }
        }

        int[][] array = {{1, 2, 3}, {3, 4}, {4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println(" " );
        }

        for(int[] r:array){
            for(int c:r)
                System.out.print(c +" ");
        }
        System.out.println(" " );
    }
}
