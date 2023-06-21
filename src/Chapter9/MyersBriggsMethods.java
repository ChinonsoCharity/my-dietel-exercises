package Chapter9;

import java.util.Scanner;

public class MyersBriggsMethods {
    private static final String[] myersQuestions = new String[20];
    private static final String[] userResponses = new String[20];
    private static String personality;

    //
    public static void myersQuestions(){

        myersQuestions[0] = """
                Question 1:
                A expend energy, enjoy groups
                B conserve energy, enjoy one-on-one
                """;
        myersQuestions[1] = """
                 Question 2:
                A interpret literally
                B look for meaning and possibilities
                """;
        myersQuestions[2]= """
                 Question 3:
                A logical, thinking, questioning
                B empathetic, feeling, accommodating
                """;
        myersQuestions[3]= """
                 Question 4:
                A organized, orderly
                B flexible, adaptable
                """;
        myersQuestions[4]= """
                 Question 5:
                A more outgoing, think out loud
                B more reserved, think to yourself
                """;
        myersQuestions[5]= """
                 Question 6:
                A practical, realistic, experimental
                B imaginative, innovative, theoretical
                """;
        myersQuestions[6]= """
                 Question 7:
                A candid, straight forward, frank
                B tactful, kind, encouraging
                """;
        myersQuestions[7]= """
                 Question 8:
                A plan, schedule
                B unplanned, spontaneous
                """;
        myersQuestions[8]= """
                 Question 9:
                A seek many tasks,public activities, interaction with others
                B seek private, solitary activities with quiet to concentrate
                """;
        myersQuestions[9]= """
                 Question 10:
                A standard, usual, conventional
                B different, novel, unique
                """;
        myersQuestions[10]= """
                 Question 11:
                A firm, tend to criticize, bold the line
                B gentle, tend to appreciate, concillate
                """;
        myersQuestions[11]= """
                 Question 12:
                A regulated structured
                B easygoing, "live" and "let live"
                """;
        myersQuestions[12]= """
                 Question 13:
                A external, communicative, express yourself
                B internal, reticent, keep it to yourself
                """;
        myersQuestions[13]= """
                 Question 14:
                A focus on here-and-now
                B look to the future, global perspective, "big picture"
                """;
        myersQuestions[14]= """
                 Question 15:
                A tough-minded,just
                B tender-hearted, merciful
                """;
        myersQuestions[15]= """
                 Question 16:
                A preparation, plan ahead
                B go with the flow, adapt as you go
                """;
        myersQuestions[16]= """
                 Question 17:
                A active, initiate
                B reflective, deliberate
                """;
        myersQuestions[17]= """
                 Question 18:
                A facts, things, "What is"
                B ideas, dreams, "What could be", philosophical
                """;
        myersQuestions[18]= """
                 Question 19:
                A matter of fact, issue - oriented
                B sensitive, people-oriented, compassionate
                """;
        myersQuestions[19]= """
                 Question 20:
                A control, govern
                B latitude, freedom
                """;
    }
    //
    public static void dishMyersQuestion(){
        System.out.println("""
                Welcome to MyersBriggs Personality Test.
                Answer the following questions to know your personality.
                Choose Either Options A OR B.
                """);
        for(int i = 0;i < myersQuestions.length;i++){
            Scanner input = new Scanner(System.in);
            System.out.println(myersQuestions[i]+"\n"+"Answer:");
//            System.out.println("Answer");
            String answer = input.nextLine().toUpperCase();
            userResponses[i] = answer;
            while (!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B")) {
                System.out.println("Please be Serious with your Life. Pick from option A or B");
                System.out.println(myersQuestions[i]);
                answer = input.nextLine().toUpperCase();
            }
            userResponses[i] = answer;
        }

    }
    //
    public static void checkPersonality(){
        System.out.println("your Personalities are "+extrovertAndIntrovert()+","
                +sensorsOrIntuition()+","+thinkersOrFeelers()+","
                +judgesOrPerceives());
    }

    public static void startMyersBriggs(){
        myersQuestions();
        dishMyersQuestion();
        checkPersonality();
    }

    private static String extrovertAndIntrovert(){
        int answerA = 0;
        int answerB = 0;
        for (int i = 0;i < myersQuestions.length; i=i+4){
            if (userResponses[i].equalsIgnoreCase("A")) {answerA++;}
            else {answerB++;}
//            System.out.println("Extrovert:"+answerA +"\t" + "Introvert:"+answerB);
            if (answerA>answerB){
                personality = " Extrovert";}
            else{
                personality = "Introvert";}
        }
        return personality;
    }
    //
    private static String sensorsOrIntuition(){
        int answerA = 0;
        int answerB = 0;
        for (int i = 2;i < myersQuestions.length; i=i+4){
            if (userResponses[i].equalsIgnoreCase("A")) answerA++;
            else answerB++;
//            System.out.println("Sensory:"+answerA +"\t" + "Intuition:"+answerB);
            if (answerA>answerB){
                personality = " Sensory";}
            else{
                personality = "Intuition";}
        }
        return personality;
    }
    //
    private static String thinkersOrFeelers(){
        int answerA = 0;
        int answerB = 0;
        for (int i = 3;i < myersQuestions.length; i=i+4){
            if (userResponses[i].equalsIgnoreCase("A")) answerA++;
            else answerB++;
//            System.out.println("Thinker:"+answerA +"\t" + "Feeler:"+answerB);
            if (answerA>answerB){
                personality = " Thinker";}
            else{
                personality = "Feeler";}
        }
        return personality;
    }
    //
    private static String judgesOrPerceives(){
        int answerA = 0;
        int answerB = 0;
        for (int i = 4;i < myersQuestions.length; i=i+4){
            if (userResponses[i].equalsIgnoreCase("A")){ answerA++;}
            else {answerB++;}
//            System.out.println("Judges:"+answerA +"\t" + "Perceives:"+answerB);
            if (answerA>answerB){
                personality = " Judges";}
            else{
                personality = "Perceives";}
        }
        return personality;
    }


}
