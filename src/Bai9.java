import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        findSadle(matrix);


    }
    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static void findSadle(int[][] matrix) {
        boolean[][] result = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i< matrix.length ; i++) {
            for (int j = 0 ; j < matrix[0].length; j ++) {
                result[i][j] = false;
            }
        }
        for ( int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];

            int index = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            int maxColumn = Integer.MIN_VALUE;
            for (int m =0; m< matrix.length; m++) {
                if (maxColumn < matrix[m][index]) {
                    maxColumn = matrix[m][index] ;
                }
            }
            if (min == maxColumn) {
                result[i][index] = true;
            }
        }
        for (int i = 0; i< result.length; i++) {
            for (int j = 0; j < result[0].length; j ++) {
                if (result[i][j] == true) {
                    System.out.print(matrix[i][j] +" " + i + " " + j);
                }
            }
        }
    }
}
