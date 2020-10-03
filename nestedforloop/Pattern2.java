package nestedforloop;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
//        sidha triangle
//        for (int j = 1; j<= n; j++) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        inverted triangle
//        for (int j = 1; j<= n; j++) {
//            for (int i = 1; i <= j-1; i++) {
//                System.out.print("  ");
//            }
//            for (int i = 1; i <= n-j+1; i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        dusra inverted
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j <= n - i + 1; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        Dusra sidha
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
