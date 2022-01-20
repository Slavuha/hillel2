package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        int[][] matrix = init(4);
        print(matrix);
        System.out.println();

        int[][] matrix2 = change11(matrix);
            print(matrix2);


    }

    public static int[][] init(int size) {
        int[][] matrixNeo = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < matrixNeo.length; i++) {
            for (int j = 0; j < matrixNeo[i].length; j++) {
                matrixNeo[i][j] = random.nextInt(9);
            }
        }
        return matrixNeo;

    }

    public static void print(int[][] matrixNeo) {
        for (int i = 0; i < matrixNeo.length; i++) {
            for (int j = 0; j < matrixNeo[i].length; j++) {
                System.out.printf("%3d", matrixNeo[i][j]);

            }
            System.out.println();
        }
    }


    public static int[][] change11(int[][] arr) {
      int temp;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            temp = arr[i][i];
            arr[i][i] = arr[i][len - i - 1];
            arr[i][len - i - 1] = temp;
        }
        return arr;

    }

}

































