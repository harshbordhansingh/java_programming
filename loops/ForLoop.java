package loops;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial");
//        System.out.println("Enter the number you want to find the multiplication table: ");
//        int tableOf = sc.nextInt();
//        System.out.println("Enter how many numbers sum you want to find");
//        int n = sc.nextInt();
//        for (i = 0; i<101; i++){
//            System.out.println("Hello World " + i);
//        }
//        to find sum of n number of terms
//        for (int i = 1; i<=n; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);
//        to find a multiplication table of a number
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i*tableOf);
//        }
//        to find factorial of a number
        int fact = sc.nextInt();
        int c = 1;
        for (int i = 1; i <= fact; i++){
            c = c*i;
        }
        System.out.println(c);
    }
}
