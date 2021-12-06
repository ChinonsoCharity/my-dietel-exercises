package Chapter6.exercise;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);

        int count =1;

        System.out.println("Enter Number");
        int tor = fac.nextInt();
        for (int fig = 2; fig<tor; fig++) {

            if (tor %fig ==0){
                count = count +1;
                System.out.println(fig);
                }
            }
        System.out.println(" no of fac is "+(count-1));
        }
    }





