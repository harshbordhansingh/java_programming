package whiledoloops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = 1;
//        do {
//            System.out.println("n is" + n);
//        }while (n != 0);
        do {
            n = sc.nextInt();
            System.out.println("number is " + n);
        }while (n != 0);
    }
}
