package Chapter7.drills;

import java.util.Scanner;
import java.util.Random;

public class ChristmasTirvia {
    public static void main(String[] args) {
        String c1 = """
                When is Christmas celebrated?
                (a) 5th May
                (b) 25th December
                """;
        String c2 = """
                People buy Artificial Christmas trees more than real ones?
                (a) True
                (b) False
                """;
        String c3 = """
                What does the red color of Christmas symbolize?
                (a) Christmas Decoration
                (b) Blood of Jesus
                """;
        String c4 = """
                What does the green color of Christmas signify
                (a) Life
                (b) Pine tress
                """;
        String c5 = """
                What does mistletoe symbolize?
                (a) Love
                (b) Life
                """;
        String c6 = """
                What is Santa's postal code?
                (a)Merry Christmas
                (b)HOH OHO
                """;
        String c7 = """
                What did the three wise men gift baby Jesus?
                (a) Myrhh, Gold, and Frankincense
                (b) Gold, Silver, and Diamond
                """;
        String c8 = """
                Where was Jesus born?
                (a) Bethlehem
                (b) Galilee
                """;
        String c9 = """
                Which ornament is present on the tip of elves' shoes?
                (a) Bells
                (b) Stars
                """;
        String c10 = """
                What is placed at the top of the Christmas tree?
                (a) Angel
                (b) Star
                """;
        String c11 = """
                Which famous Christmas carol talks about the gifts received during the twelve days of Christmas?
                (a) 'Carol of Bell'
                (b)'The Twelve Days Of Christmas'
                """;
        String c12 = """
                What is the color of Santa's Belt?
                (a) Red Belt
                (b) Black Belt
                """;
        String c13 = """
                Where does Santa Claus live?
                (a) North Pole
                (b) South Pole
                """;
        String c14 = """
                How many reindeers pull Santa's Sled?
                (a) Nine
                (b) Ten
                """;
        String c15 = """
                 What is the color of Rudolf's nose
                (a) Black
                (b) Red
                """;
        String c16 = """
                 Name the highest-grossing Christmas movie of all time.
                (a) Home Alone
                (b) The Grinch
                """;
        String c17 = """
                Who designed the Red outfit for Santa Claus?
                (a) Elves
                (b) Coca-cola company
                """;
        String c18 = """
                 who are the workers at the North Poles
                (a) Angels
                (b) Elves
                """;
        String c19 = """
                The character of Santa Claus is based on St. Nicholas. True or false?
                (a) True
                (b) False
                """;
        String c20 = """
                What food gift is given to Santa?
                (a) Cookies and milk
                (b) Candy and Sweet
                """;
        Question[] xmasQuestions = {
                new Question(c1, "b"),
                new Question(c2, "a"),
                new Question(c3, "b"),
                new Question(c4, "a"),
                new Question(c5, "a"),
                new Question(c6, "b"),
                new Question(c7, "a"),
                new Question(c8, "a"),
                new Question(c9, "a"),
                new Question(c10, "a"),
                new Question(c11, "b"),
                new Question(c12, "b"),
                new Question(c13, "a"),
                new Question(c14, "a"),
                new Question(c15, "b"),
                new Question(c16, "a"),
                new Question(c17, "b"),
                new Question(c18, "b"),
                new Question(c19, "a"),
                new Question(c20, "a")};

        randomize(xmasQuestions,20);
        takeTrivia(xmasQuestions);
    }

    public static void takeTrivia(Question[] xmasQuiz) {
        System.out.println("Welcome to Christmas Trivia");
        System.out.println("Care to test your Christmas Spirit");
        System.out.println("Answer the Following Questions\n");
        int score = 0;
        Scanner user = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println(xmasQuiz[i].prompt);
            String response = user.nextLine();
            if (response.equals(xmasQuiz[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + "/" + 5);
        System.out.println("Wishing You A Merry Christmas and Happy Holiday");
    }

    public static void randomize(Question[] Question, int n) {
        Random shake = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = shake.nextInt(i);
            Question xmasQuiz = Question[i];
            Question[i] = Question[j];
            Question[j] = xmasQuiz;

        }
    }
}