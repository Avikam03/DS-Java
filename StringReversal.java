package practice;

import java.util.Arrays;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(reverseString("Shivam"));
    }

    private static String reverseString(String str) {
        char[] char_array = str.toCharArray();
        String string = "";
        for(int i=str.length()-1;i>=0;i--){
            string = string + char_array[i];
        }
        return string;
    }
}
