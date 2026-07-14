package Regex;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[a-z]+");

        System.out.println(pattern);
    }
}
