package conditionals;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age:");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("tu layak nhi hai");
        }
        else {
            System.out.println("tu layak hai");
        }
    }
}
