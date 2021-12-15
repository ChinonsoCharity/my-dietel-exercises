package Chapter7.drills;

import java.sql.Array;
import java.util.Arrays;

public class LessOneArray {
    public static void main(String[] args) {
        int[] lessOne = {3, 4, 2, 5, 1};
        int sum = 0;
        for (int r = 0; r < lessOne.length; r++) {
            for (int k = 0; k < r; k--) {
                sum = sum + lessOne[k];
                int maxi = lessOne[0];
                int mini = lessOne[0];
                maxi = Math.max(maxi,sum);
                mini = Math.min(mini,sum);
                System.out.println(maxi);

                System.out.println(mini);

            }

        }

    }

}
