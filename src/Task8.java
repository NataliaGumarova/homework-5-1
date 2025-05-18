import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название переменной");
        String text = scan.nextLine();
        boolean c = text.contains("_");
            if (c) {
                String text1 = text.toLowerCase();
                if (text1.equals(text)) {
                    System.out.println("C++");
                    String[] words = text.split("_");
                    String textJava = words[0];
                    for (int i = 1; i < words.length; i++) {
                        if (!words[i].isEmpty()) {
                            String w = words[i].substring(0, 1);
                            w = w.toUpperCase();//замена первой буквы на заглавную
                            words[i] = words[i].substring(1);//убрали первую букву из слова
                            words[i] = w.concat(words[i]);//сложили большую букву с остатком слова
                            textJava = textJava.concat(words[i]);
                        }
                    }
                    System.out.println("переменная в java: " + textJava);
                } else {
                    System.out.println("смешанный синтаксис");
                }
            } else {
                String regular = "[a-z]*";
                if(text.matches(regular)){
                    System.out.println("переменная принадлежит обоим языкам");
                } else {
                    System.out.println("Java");
                    char[] words = text.toCharArray();
                    String textC = Character.toString(words[0]);
                    for(int i = 1; i < words.length; i++) {
                        String text1C = Character.toString(words[i]);
                        String regularCaps = "[A-Z]";
                        if (text1C.matches(regularCaps)) {
                            text1C = "_" + text1C.toLowerCase();
                        }
                        textC = textC.concat(text1C);
                    }
                    System.out.println("переменная в С++: " + textC);
                }
            }
    }
}

