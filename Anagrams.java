package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("tar","raat"));
    }

    private static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1 = ch1.toString();
        String s2 = ch1.toString();
        if(s1.equals(s2) == true){
            return true;
        }
        else{
            return false;
        }
    }
}
