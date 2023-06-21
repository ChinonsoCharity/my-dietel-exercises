package Chapter14.classwork;

public class Balloon {
    public static void main(String[] args) {
//        System.out.println("NOOLLAB");
       String word= "BALLOON";
       String newWord = "";
        for (int i = word.length()-1; i>=0 ;--i){
            newWord += word.charAt(i);
        }
        System.out.println(newWord);
    }
}
