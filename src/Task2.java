import java.util.Scanner;

public class  Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        int sentenceCountWhile = countSentencesWithWhile(text);
        System.out.println("Кількість речень (while): " + sentenceCountWhile);

        int sentenceCountDoWhile = countSentencesWithDoWhile(text);
        System.out.println("Кількість речень (do-while): " + sentenceCountDoWhile);
    }

    public static int countSentencesWithWhile(String text) {
        int count = 0;
        int i = 0;
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c == '.') {
                count++;
            }
            i++;
        }
        return count;
    }

    public static int countSentencesWithDoWhile(String text) {
        int count = 0;
        int i = 0;
        if (text.length() > 0) {
            do {
                char c = text.charAt(i);
                if (c == '.') {
                    count++;
                }
                i++;
            } while (i < text.length());
        }
        return count;
    }
}
