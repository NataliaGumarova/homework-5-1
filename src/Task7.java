import  java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        char[] symbols = text.toCharArray();
        String regularLowerCase = "[a-zа-я]";
        String regularUpperCase = "[A-ZА-Я]";
        String regularNumbers = "[0-9]";
        String text1 = "";
        for (int i = 0; i < text.length(); i++) {
            String w = text.substring(i,i+1);
            if (w.matches(regularUpperCase)) {
                w = w.toLowerCase();
            } else if (w.matches(regularLowerCase)) {
                w = w.toUpperCase();
            } else if (w.matches(regularNumbers)) {
                w = "_";
            }
            text1 = text1.concat(w);
        }
        System.out.println(text1);
    }
}
