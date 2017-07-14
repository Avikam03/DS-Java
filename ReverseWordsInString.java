package practice;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("This is me"));
    }

    private static StringBuffer reverseWords(String str) {
        String[] str_array = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<str_array.length;i++){
            sb.append(str_array[i]).reverse();
            sb.append(" ");
        }
        return sb;
    }
}
