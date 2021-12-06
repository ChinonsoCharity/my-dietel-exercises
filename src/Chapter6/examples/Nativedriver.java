package Chapter6.examples;

import java.util.Scanner;

public class Nativedriver{
    public static void main(String[] args){
//        Native aNative = new Native(name:"Chinonso", scvId:1);
//        System.out.println(aNative.getName());
//        System.out.println(aNative.getScvId());

        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println( " Enter scv number");
        int scvNumber = scanner.nextInt();

        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());
    }
}


