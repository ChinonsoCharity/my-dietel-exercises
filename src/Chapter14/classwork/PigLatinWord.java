package Chapter14.classwork;

import java.util.Scanner;

public class PigLatinWord {

    public static void main(String[] args) {
        System.out.println("Enter a sentence and i will convert it to Pig latin");
        Scanner scanner = new Scanner(System.in);
        String[] sentence = scanner.nextLine().split(" ");
        StringBuilder pigLatinSentence = new StringBuilder();
        for (String word : sentence){
            pigLatinSentence.append(printPigLatinWord(word)).append(" ");
        }
        System.out.println(pigLatinSentence);
    }

    public static String printPigLatinWord(String word) {
        StringBuilder result = new StringBuilder(word);
        Character character = result.charAt(0);
        result.insert(result.length(), character);
        result.append("ay");
        return result.substring(1);
    }


}