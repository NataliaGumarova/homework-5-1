import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение");
        String text1 = scan.nextLine();
        String text2 = text1.replace(",", " ");
        String text3 = text2.replace(".", " ");
        String text4 = text3.replace("?", " ");
        String text5 = text4.replace("!", " ");
        String text6 = text5.replace(":", " ");
        String text7 = text6.replace(";", " ");
        String text = text7.replace("-", " ");

        String[] word = text.split(" ");
        double itog = 0.0;
        int m = 0;
        for (int i = 0;i < word.length; i++) {
            String a = word[i];
            if (a.trim().length() > 0){
                m = m + 1;
            System.out.println(word[i]);
            int w = word[i].length();
            itog = w + itog;
            }
        }
        System.out.println("Средняя длина слова - " + itog /m);
    }
}
