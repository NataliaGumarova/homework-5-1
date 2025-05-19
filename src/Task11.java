import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите слово");
        String text = scan.next();
        String regularLanguage = "[a-c]*";
        boolean textCont = text.matches(regularLanguage);
        boolean textContB = text.contains("bb");
        two:if (textCont && !textContB) {
            boolean textContains;
            for (int i = 0; i < text.length(); i++) {
                for (int a = i + 1; a <= text.length() / 3; a++) {
                    String regular = text.substring(i, a).concat(text.substring(i, a)).concat(text.substring(i, a));
                    textContains = text.contains(regular);
                    if (textContains) {
                        System.out.println("Слово не принадлежит языку Мумба-Юмба");
                        break two;
                    }
                }
            }
            System.out.println("Слово принадлежит языку Мумба-Юмба");
        } else {
            System.out.println("Слово не принадлежит языку Мумба-Юмба");
        }
    }
}