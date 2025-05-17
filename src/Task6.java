public class Task6 {
    public static void main(String[] args) {
        String[] numbers = new String[100_000];
        for (int i = 0; i < 100_000; i++) {
            numbers[i] = String.valueOf(i);
        }
        int a = 0;
        for (int i = 0; i < 100_000; i++) {
            boolean n4Contains = numbers[i].contains("4");
            boolean n13Contains = numbers[i].contains("13");
            if (n4Contains || n13Contains) {
                a += 1;
            }
        }
        System.out.println(a);
    }
}
