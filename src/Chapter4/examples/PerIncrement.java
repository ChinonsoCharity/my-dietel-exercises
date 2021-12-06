package Chapter4.examples;

public class PerIncrement {
    public static void main(String[] args) {
        int count = 0;
        int a = 5;
        int b = 6;
        int sum;

        sum = a + ++b;
        System.out.println(sum);
    }
}