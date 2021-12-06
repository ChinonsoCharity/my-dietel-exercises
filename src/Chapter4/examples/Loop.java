package Chapter4.examples;


public class Loop {
        public static void main(String[] args) {
            int number = 2;

           while(number <= 100) {
                System.out.print(number + " ");
                number = number + 2;

            }
            System.out.println();

            int num = 1;

            while(num < 100) {
                System.out.print(num + " ");
                num = num + 2;

            }
        }
    }