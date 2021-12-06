package Chapter5.morningDrillWeekend;

public class PatternC {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int k = 6; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
