import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scan.nextLine();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите символ");
        String symbol = scan1.next();
        boolean s = text.contains(symbol);
        if (s) {
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == symbol.charAt(0)) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Символ '" + symbol + "' в строке отсутствует");
        }
    }
}