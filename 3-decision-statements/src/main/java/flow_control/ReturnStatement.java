package flow_control;

import java.util.Arrays;

public class ReturnStatement {

    public static void main(String[] args) {
        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int value = 3;
        int[] positionValue = searchForValue(list, value);
        if (positionValue != null) {
            System.out.println("Position value: " + Arrays.toString(positionValue));
        } else {
            System.out.println("Value not found");
        }
    }

    private static int[] searchForValue(int[][] list, int value) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == value) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

}
