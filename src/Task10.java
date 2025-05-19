import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        int lenght = text.length();
        for (int i = 1; i <= text.length(); i++) {
            for (int a = text.length()-i; a > 0; a --) {
                System.out.print(" ");
            }
            System.out.println(text.substring(0,i));
        }
        for (int i = 1; i <= text.length(); i++) {
            System.out.println(text.substring(i,text.length()));
        }
    }
}
