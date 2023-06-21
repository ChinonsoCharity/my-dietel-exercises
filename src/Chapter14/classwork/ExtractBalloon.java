package Chapter14.classwork;

import java.util.Scanner;

public class ExtractBalloon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine().toUpperCase();
      //  String  check = "BALLOON";
//        StringBuilder checkWord = new StringBuilder();

        int count = 0;
        if (word.length()>=2) {
            int b = 0;
            int a = 0;
            int l = 0;
            int o = 0;
            int n = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'B') b++;
                else if (word.charAt(i) == 'A') a++;
                else if (word.charAt(i) == 'L') l++;
                else if (word.charAt(i) == 'O') o++;
                else if (word.charAt(i) == 'N') n++;
            }
            l = l/2;
            o = o/2;
            count = Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
                }
        System.out.println(count);
            }
        }
