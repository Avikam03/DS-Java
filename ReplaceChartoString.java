package practice;

public class ReplaceChartoString {
    public static void main(String[] args) {
        replaceChar(str);
    }

    private static void replaceChar(String str, String str1) {
        String[] arr = str.split(" ");
        for(String strin : arr){
            arr = strin + str1;
        }
    }
}
