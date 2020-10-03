package multidimensionalarrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the rows: ");
        int cols = sc.nextInt();
        int [] [] a = new int[rows][cols];
        int [] [] b = new int[rows][cols];
        System.out.print("Enter the first matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the second matrix: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                b[i][j] = sc.nextInt();
            }
        }
        int [] [] c = new int[rows][cols];
        System.out.println("resultant array is: ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
