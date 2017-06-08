package practice;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is me"););
    }

    private static String reverseWords(String str) {
        String[] str_array = str.split(" ");
        for(int i=str_array.length-1;i>=0;i++){
            String string = "";
            char[] char_array = str_array[i].toCharArray();
            for(int j=char_array.length-1;j>=0;j--){
                string = string + char_array[j];
            }
        }
    }
}
