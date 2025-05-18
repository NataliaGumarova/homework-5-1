import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое выражение");
        String text1 = scan.nextLine();
        System.out.println("Введите второе выражение");
        String text2 = scan.nextLine();
        text1 = text1.replace(" ", "")
                .replace(".", "")
                .replace(",", "")
                .replace(":", "")
                .replace(";", "")
                .replace("!", "")
                .replace("?", "")
                .replace("/", "")
                .replace("(", "")
                .replace(")", "")
                .replace("\"", "");
        text1 = text1.toLowerCase();
        text2 = text2.replace(" ", "")
                .replace(".", "")
                .replace(",", "")
                .replace(":", "")
                .replace(";", "")
                .replace("!", "")
                .replace("?", "")
                .replace("/", "")
                .replace("(", "")
                .replace(")", "")
                .replace("\"", "");
        text2 = text2.toLowerCase();
        char[] texts1 = text1.toCharArray();
        char[] texts2 = text2.toCharArray();
        two: if (texts1.length == texts2.length) {
            Arrays.sort(texts1);
            Arrays.sort(texts2);
            for (int i = 0; i < texts1.length; i++) {
                if (texts1[i] != texts2[i]) {
                    System.out.println("No");
                    break two;
                }
            }
            System.out.println("Yes");
        }
    }
}
