package arrays;

public class Arrarys {
    public static void main(String[] args){
//        int [] marks = new int[5];
//        System.out.println(marks[0]);
        int[] age = { 2, 3, 4, 5, 6};
//        double[] marks = {1.0, 3.14, 2.9};
//        marks[1] = 4.56;
//        System.out.println(marks[0] + " "  + age[3]);
//        for (int i = 0; i < age.length; i++){
//            System.out.println(age[i]);
//        }
        for (int item :
                age) {
            System.out.print(item + " ");
        }
    }
}
