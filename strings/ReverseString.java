package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        int length = a.length();
        for (int i = length - 1; i >= 0; i--){
            rev.append(a.charAt(i));
        }
        System.out.println("reverse is: " + rev);
    }
}
