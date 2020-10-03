package nestedforloop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int tableOf = sc.nextInt();
        int c;
        for (int j = 1; j<=20; j++) {
            for (int i = 1; i <= 10; i++) {
                c = tableOf * i;
                System.out.print(c + " ");
            }
            tableOf += 1;
            System.out.println();
        }

    }
}
