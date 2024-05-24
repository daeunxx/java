package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int n = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                arr[row][colum] = n++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
