package Chapter4.Assignments;

public class TabularOutput {
    public static void main(String[] args) {
    printTabular();
    }
    public static void printTabular(){
        int n1;
        int n2;
        int n3;
        int n4;
        for (int i = 1; i<=5; i++){
            n1 = i;
           n2 = i*i;
           n3 =i*i*i;
           n4 = n2* n2;
           System.out.println(n1+" "+ n2+" "+ n3+" "+n4);
        }

    }

}
