package Chapter2.exercises;

public class DisplayNumbers {
    public static void main(String[] args)
    {
//Scanner input = new Scanner(System.in);

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;

        System.out.println(num1+" "+num2+" "+num3+" "+num4);

// (b) Use four system.out.print statement

        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);
        System.out.println(num4);

// (c) Use one system.out.printf statement

        System.out.printf("%d %d %d %d" , num1, num2, num3, num4);
    }

}
