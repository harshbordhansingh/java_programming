package strings;

public class StringIntro {
    public static void main(String[] args){
        String name = "       Harsh is a bad boy       ";
        System.out.println(name);
        String name2 = new String("Harsh");
//        System.out.println(name == name2);
        System.out.println(name.charAt(7));
        System.out.println(name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(6, 17));
        System.out.println(name.contains("Harsh"));
        System.out.println(name.equals(name2));
        System.out.println(name.isEmpty());
        System.out.println(name.concat(" Singh"));
        System.out.println(name.replace('a', 'c'));
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('i'));
        System.out.println(name.trim());
//        split ke liye video dekh
//        strings also have tolower and toupper
//    strings are immutable
    }
}
