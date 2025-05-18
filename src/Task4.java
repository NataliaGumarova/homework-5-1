import java.util.Scanner;

public class Task4 {
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
        for (int i = 0; i < words.length; i++) {
            String regular = "^[aAeEyYuUiIoO][a-z]+[qQwWrRtTpPsSdDfFgGhHjJkKlLzZxXcCvVbBnNmM]$";
            boolean y = words[i].trim().matches(regular);
                if (y) {
                 System.out.println(words[i].trim());
                }
            }
        }
    }
