package Chapter14.classwork;

import java.util.Arrays;

public class StringUtilMain {
    public static void main(String[] args) {
        StringUtil check = new StringUtil("cow in my soup");
        System.out.println(Arrays.toString(check.split("in")));
    }
}
