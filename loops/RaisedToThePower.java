package loops;

import java.util.Scanner;

public class RaisedToThePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int c = 1;
        for (int i = 0; i < b; i++){
            c = c*a;
        }
        System.out.println("Your desired number is: " + c);
    }
}
