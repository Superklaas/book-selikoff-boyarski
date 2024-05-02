package arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] array = {{1,4},{3},{9,8,7}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

    }

}
