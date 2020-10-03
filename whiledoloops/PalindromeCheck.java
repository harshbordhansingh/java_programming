package whiledoloops;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int r = 0;
        while (temp > 0){
            int lastDigit = temp % 10;
            r = r*10 + lastDigit;
            temp /= 10;
        }
        if (r == n){
                System.out.println(n + " is palindromic");
            }else {
                System.out.println(n + " is not palindromic");
            }
    }
}
