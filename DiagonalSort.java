package Quora;

import java.util.ArrayList;
import java.util.List;

public class DiagonalSort {
    public static int[][] diagonalSort(int[][] matrix) {
        if (matrix==null || matrix.length==0) return matrix;
        int m = matrix.length, n = matrix[0].length;
        int[][] sol = new int[m][n];
        for (int i=0; i<n; i++) {
            List<Integer> dia = new ArrayList<>();
            int row = 0, col = i;
            while(row<m && col<n) {
                dia.add(matrix[row][col]);
                row++;
                col++;
            }
            dia.sort((a,b)->a-b);
            row = 0; col = i;
            for (int num : dia) sol[row++][col++] = num;
        }
        for (int i=0; i<m; i++) {
            List<Integer> dia = new ArrayList<>();
            int row = i, col = 0;
            while(row<m && col<n) {
                dia.add(matrix[row][col]);
                row++;
                col++;
            }
            dia.sort((a,b)->a-b);
            row = i; col = 0;
            for (int num : dia) sol[row++][col++] = num;
        }
        return sol;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                new int[]{8,4,1},
                new int[]{4,4,1},
                new int[]{4,8,9}
        };
        int[][] sol = diagonalSort(matrix);
        for (int[] row : sol) {
            for (int n : row) {
                System.out.print(n);
            }
            System.out.println();
        }

    }
}
