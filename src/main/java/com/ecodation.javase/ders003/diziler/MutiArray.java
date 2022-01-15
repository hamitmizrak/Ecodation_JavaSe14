package com.ecodation.javase.ders003.diziler;

public class MutiArray {


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {3, 4, 5, 6}, {3, 4, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        }


}
