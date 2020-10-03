package arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        int c = 0;
        boolean is = false;
        for (int i = 0; i < b.length(); i++){
            char d = b.charAt(i);
            if (d == '(' || d == ')') {
                is = true;
                break;
            }
        }
        if (is){
            c += b.length()/2;
            System.out.println(c);
        }
    }
}
