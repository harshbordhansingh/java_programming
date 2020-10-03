package nestedforloop;

import java.util.Scanner;

public class AdvancePatterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int c = 1;
        int rows = 2*n - 1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print("*   ");
//            }
//            System.out.println();
//        }
//        number design
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++){
//                System.out.print(c++ +"   ");
//            }
//            System.out.println();
//        }
//        different type
//        for (int i = 1; i <= rows; i++){
//            if (i <= n) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            }else {
//                for (int j = 1; j <=  rows - i + 1; j++){
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }
//        bich me gayab wala pattern
        System.out.println("*");

        for (int i = 2; i <= n - 1; i++){
            System.out.print("* ");
            for (int j = 1; j <= i - 2; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
        }
    }
}
