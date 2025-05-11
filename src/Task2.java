import java.util.Scanner;
import static java.lang.String.valueOf;

public class Task2 {
    public static void main(String[] args) {
        String number = "1";
        int i = 1;
        while (number.length() <=1000) {
            i += 1;
            String s = valueOf(i);
            number = number.concat(s);
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер позиции");
        int n = scan.nextInt();
        System.out.println(number.charAt(n - 1));
    }
}
