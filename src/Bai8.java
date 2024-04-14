import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        inputMatrix(matrix, sc);
        printMatrix(matrix);
        if (check0(matrix)) {
            System.out.print("Co");
        }
        else {
            System.out.print("Ko");
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
    public static boolean check0(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            boolean check = true;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)  {
                    check = false;
                    continue;
                }
            }
            if (check == true) {
                return true;
            }
        }
        return false;

    }

}
