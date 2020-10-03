package com.harsh;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our code here you can calculate your simple interest");
        System.out.println("Enter Your Name-");
        String name = sc.nextLine();
        System.out.println("Enter the principal-");
        int p = sc.nextInt();
        System.out.println("Enter the rate-");
        float r = sc.nextFloat();
        System.out.println("Enter the years you will invest-");
        int y = sc.nextInt();
        float SiInterest = (p*r*y)/100;
        System.out.println(name.toUpperCase() + " your simple interest is: " + SiInterest);
    }
}
