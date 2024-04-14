import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        int[] maxPosition = findMax(matrix);
        int maxRow = maxPosition[0];
        int maxCol = maxPosition[1];
        System.out.println("Giá trị lớn nhất trong ma trận là: " + matrix[maxRow][maxCol] + " tại vị trí [" + (maxRow + 1) + "][" + (maxCol + 1) + "]");
    }


    public static void inputMatrix(int[][] matrix, Scanner sc) {
        for (int i = 0; i < matrix.length ; i ++) {
            for ( int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

    }
    public static void printMatrix(int[][] matrix ) {
        for (int i = 0; i < matrix.length ; i ++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
    }
    public static int[] findMax(int[][] matrix ) {
        int max = matrix[0][0];
        int[] maxPosition = new int[2];
        for (int i = 0; i < matrix.length ; i ++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    maxPosition[0] = i;
                    maxPosition[1] = j;
                }
            }
        }
        return maxPosition;


    }
}
