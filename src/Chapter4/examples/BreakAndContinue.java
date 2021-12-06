package Chapter4.examples;

public class BreakAndContinue {
    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            if(i==5){
                continue;
//                break;
            }
            System.out.print(i+" ");
        }
    }
}
