import java.util.Scanner;

public class Sort {
    // Nhap vao n mang so nguyen , sap xep no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n phan tu ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int[] sorted = sortArr(arr);
        for ( int i = 0 ; i < n ;i++) {
            System.out.print(sorted[i] + " ");
        }

    }

    public static int[] sortArr(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i ++) {
            for (int j = i + 1; j< arr.length ; j ++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
}
