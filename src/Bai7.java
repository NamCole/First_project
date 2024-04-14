import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        System.out.println(findMaxColumn(matrix) + 1);
        int[] index = findAllMaxColumn(matrix);
        for (int i = 0; i< index.length; i++) {
            if (index[i] != -1) {
                System.out.print(index[i]+1 + " ");
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

    public static int findMaxColumn(int[][] matrix) {
        int index = -1;

        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }

        }
        return index;
    }
    public static int[] findAllMaxColumn(int[][] matrix) {

        int[] index = new int[matrix.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = -1;
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum+= matrix[i][j];
            }
            if (sum == max) {
                index[i] = i;
            }

        }
        return index;
    }

}
