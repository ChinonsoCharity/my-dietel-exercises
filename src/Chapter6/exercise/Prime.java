package Chapter6.exercise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int count = 1;
        Scanner prim = new Scanner(System.in);
        System.out.println("Enter Number");
        int tor = prim.nextInt();
        for (int fig = 1; fig < tor; fig++) {

            if (tor % fig == 0){
                count = count + 1;

                    }
                }
        if (count == 2){
            System.out.printf("%d is a Prime Number",tor);
            }
        if(count > 2){
            System.out.printf("%d is not a Prime Number",tor);
        }

        }
    }


