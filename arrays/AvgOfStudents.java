package arrays;

import java.util.Scanner;

public class AvgOfStudents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter the : ");
            marks[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < n; i++){
            avg += marks[i];
        }
        avg /= n;
        System.out.println("Average marks is: " + avg);
    }
}
