package practice;

import java.util.Arrays;

public class BubbleSortChar {
    public static void main(String[] args) {
        System.out.println(sort("Shivam"));
    }

    private static String sort(String str) {
        str = str.toLowerCase();
        char[] char_array = str.toCharArray();
        char temp;
        int first,second;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length()-i-1;j++){
                first = (int)char_array[j];
                second = (int)char_array[j+1];
                if(first > second){
                    temp = char_array[j];
                    char_array[j] = char_array[j+1];
                    char_array[j+1] = temp;
                }
            }
        }
        str = String.valueOf(char_array);
        return str;
    }
}
