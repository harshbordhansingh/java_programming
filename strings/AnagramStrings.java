package strings;

import java.util.Scanner;


public class AnagramStrings{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String a = sc.nextLine();
        System.out.println("Enter the second string");
        String b = sc.nextLine();

        boolean isAnagram = true;
//        boolean[] visited = new boolean[b.length()];
//
//        if (a.length() == b.length()){
//            for (int i = 0; i < a.length(); i++){
//                char c = a.charAt(i);
//                for (int j = 0; j < b.length(); j++){
//                    if (b.charAt(j) == c && !visited[j]){
//                        visited[j] = true;
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram){
//                    break;
//                }
//            }
//        }

        int[] al = new int[256];
//        int[] bl = new int[256];
        for (char c :
                a.toCharArray()) {
            al[(int) c]++;
        }

        for (char d :
                b.toCharArray()) {
            al[(int) d]--;
        }

        for (int i = 0; i < 256; i++){
            if (al[i] != 0){
                isAnagram = false;
                break;
            }
        }

        if (isAnagram){
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }
    }
}