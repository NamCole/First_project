import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        inputMatrix(matrix,sc);
        printMatrix(matrix);
        if (soThua(matrix)) {
            System.out.print("Ma tran co thua");
        }
        else {
            System.out.print("Ma tran ko thua");
        }
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
    public static boolean soThua(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length ; i ++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    count += 1;
                }
            }
        }
        if ( count > (matrix.length* matrix[0].length)/2) {
            return true;
        }
        return false;
    }


}
