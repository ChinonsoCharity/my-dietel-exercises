package Chapter4.examples;

public class Count2511 {
    public static void main(String[] args){
       int count = 0;
        int  a = 5;
        int b = 6;
        int sum1;
        int sum2;
        sum1 = a + b++ ; //post increment operator
        sum1 =   5 + 6;
//        b = 7;
//        sum1 = 11;
//        b = 7;
        sum2 = a+ ++b; //pre increment operator
//        sum2 = 5 + 8;
//        sum1 = 13;
//        b = 7;
        System.out.println(sum1);
        System.out.println(sum2);


    }

}
