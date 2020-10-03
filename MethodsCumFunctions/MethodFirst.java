package MethodsCumFunctions;

public class MethodFirst {
    public static void main(String[] args){

        int firstNum = 34;
        int secondNum = 23;
        int result = maxOf(firstNum, secondNum);
        System.out.println(result);

    }

    static int maxOf(int a, int b){

//        if (a > b){
//            return a;
//        }else {
//            return b;
//        }
        return Math.max(a, b);

    }

}
