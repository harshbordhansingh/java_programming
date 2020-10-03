package com.harsh;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
//        int x = 4;
//        double y = x;
//        System.out.println(x);
//        System.out.println(y);
//        manual type casting
        double myDouble = 2.8462;
        int a = (int)myDouble;
        System.out.println(myDouble);
        System.out.println(a);
//        taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your input:\n");
//        int x = sc.nextInt();
        String hello = sc.nextLine();
        System.out.println("your input is:" + hello);
    }
}
