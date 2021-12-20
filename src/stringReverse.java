//Here we are reversing a string if hello then olleh

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        //using the stringbuilder
        StringBuilder str = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("    ");

        int length = str.length();

        for (int i= 0; i<length; i++){
            str2.setCharAt(i , str.charAt(length-i));

        }
        System.out.println(str2);

    }

}
