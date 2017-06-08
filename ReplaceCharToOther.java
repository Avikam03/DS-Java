//Replace a character in a string with another character.
package practice;

import java.util.Arrays;

public class ReplaceCharToOther {
    public static void main(String[] args) {
        System.out.println(replaceChar("Java is Great", ' ', "%20"));
    }

    private static String replaceChar(String str, char ch1, String ch2) {
        char[] char_array = str.toCharArray();
        for(int i=0;i<str.length();i++){
            Character character = str.charAt(i);
            if(character.toString() == ch1){
                char_array[i] = ch2;
            }
        }
        return String.valueOf(char_array);
    }
}
