import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        int[] index = findMaxColumnPositive(matrix);
        for (int i = 0; i<index.length; i++ ) {
            if (index[i] != -1 ) {
                System.out.print(index[i] + " ");
            }
        }

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
    public static int[] findMaxColumnPositive(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > 0) {
                    count += 1;
                }
                if (count > max) {
                    max = count;
                }
            }
        }
        int[] index = new int[matrix[0].length];
        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > 0) {
                    count += 1;
                }
            }
            if (count == max) {
                    index[j] = j;
            }
        }
        return index;
    }


}
