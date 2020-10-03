package conditionals;
import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operation you want to do: ");
        System.out.println(" + - / * %");
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Your number is: " + (a + b));
                break;
            case '-':
                System.out.println("Your number is: " + (a - b));
                break;
            case '*':
                System.out.println("Your number is: " + (a * b));
                break;
            case '/':
                System.out.println("Your number is: " + (a / b));
                break;
            case '%':
                System.out.println("Your number is: " + (a % b));
                break;
            default:
                System.out.println("Entered operation is not available");
        }
//        if (c == '+'){
//            System.out.println("Your number is: " + (a+b));
//        }else if (c == '-'){
//            System.out.println("Your number is: " + (a-b));
//        }else if (c == '*'){
//            System.out.println("Your number is: " + (a*b));
//        }else if (c == '/'){
//            System.out.println("Your number is: " + (a/b));
//        }else if (c == '%'){
//            System.out.println("Your number is: " + (a%b));
//        }else {
//            System.out.println("Entered operation is not available");
//        }
    }
}
