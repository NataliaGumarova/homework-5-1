import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        String regular = "(-*)(\\u0028+|\\u0029+|\\u005B+|\\u005D+)\\w*\\W*";
            int k = 0;
            String[] words = text.split(";|:");
            for (int i = 0; i < words.length; i++) {
                if (words[i].matches(regular)) {
                    k +=1;
                }
            }
            System.out.println("В тексте встречается " + k + " смайлов");
    }
}
