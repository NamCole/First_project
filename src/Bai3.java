import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        if (checkPostive(matrix)) {
            System.out.println("Ma tran co so duong");
        } else {
            System.out.println("Ma tran ko co so duong");
        }
        if (checkAllPositive(matrix)) {
            System.out.print("Tat ca phan tu ma tran deu duong");
        }
        else {
            System.out.print("Co it nhat 1 phan tu trong ma tran ko duong");
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

    public static boolean checkPostive(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    return true;
                }
            }

        }
        return false;
    }
    public static boolean checkAllPositive(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;

    }
}

