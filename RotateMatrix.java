package Quora;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix, int k) {
        k %= 4;
        while (k>0) {
            rotate(matrix);
            k--;
        }
    }

    private static void rotate(int[][] matrix) {
        if (matrix==null || matrix.length==0) return;
        for (int i=0; i<matrix[0].length; i++) {
            for (int j = i+1; j<matrix[0].length; j++)
                swap(matrix, i, j, j, i);
        }
        for (int i=0; i<matrix[0].length; i++)
            reverseSort(matrix[i], 0, matrix[0].length-1);
    }

    private static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }

    private static void swap(int[] row, int i, int j) {
        int temp = row[i];
        row[i] = row[j];
        row[j] = temp;
    }

    private static void reverseSort(int[] row, int start, int end) {
        if (start>=end) return;
        for (int i=start; i<=(start+(end-start)/2); i++)
            swap(row, i, start+end-i);
    }
}
