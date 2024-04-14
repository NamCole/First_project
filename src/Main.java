import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // check co la so nguyen to hay k
//        if (checkPrime(a)) {
//            System.out.print(a + " la so nguyen to");
//        }
//        else {
//            System.out.print(a +" khong la so nguyen to8");
//        }
        // danh sach cac so ngto nho hon n
//        for (int i = 0; i < n; i++) {
//            if (checkPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
        // in ra n so nguyen to dau tien
        int sum = 0;
        int i = 2;
        while (sum != n) {
            if (checkPrime(i)) {
                sum+=1;
                System.out.print(i + " ");
            }
            i++;

      }


    }

    public static boolean checkPrime(int n) {
        if ( n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for ( int i = 2; i <= squareRoot ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }

}

