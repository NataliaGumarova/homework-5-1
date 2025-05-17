import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        String word = text.replace(",", "").
                replace(".", " ").
                replace("!", " ").
                replace("?", " ").
                replace("(", " ").
                replace(")", " ").
                replace(";", " ").
                replace(":", " ").
                replace("-", " ").
                replace("_", " ").
                replace("\"", " ");
        String[] words = word.split(" ");
        int a = 0;
        for (int i = 0; i < words.length; i++) {
            char[] w = words[i].trim().toCharArray();
            if (w.length % 2 == 0) {
                a += 1;
            }
        }
        System.out.println("Чётное количество букв имеют " + a + " слов в строке");
    }
}
