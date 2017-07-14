////Replace a character in a string with another character.
//package practice;
//
//import java.util.Arrays;
//
//public class ReplaceCharToOther {
//    public static void main(String[] args) {
//        StringBuffer str_new = replaceChar("Java is Great", ' ', "%20");
//        System.out.println(str_new);
//    }
//
//    private static StringBuffer replaceChar(String str, char ch1, String ch2) {
//        StringBuffer sb = new StringBuffer();
//        char[] ch_arr = str.toCharArray();
//        for(int i=0;i<str.length();i++){
//            if(ch_arr[i] == ch1){
//                sb.append(ch2);
//            }
//            else{
//                sb.append(ch_arr[i]);
//            }
//        }
//        return sb;
//    }
//
//}


//package practice;
//
//import java.util.Arrays;
//
//class ReplaceCharToOther{
//    public static void main(String[] args) {
//        String str = "Java is great";
//        String[] str_array = str.split(" ");
//        StringBuffer sb = new StringBuffer();
//        for(int i=0;i<str_array.length;i++){
//            if(i == str_array.length-1){
//                sb = sb.append(str_array[i]);
//                break;
//            }
//            sb = sb.append(str_array[i] + "Shivam");
//        }
//        System.out.println(sb);
//    }
//}



package practice;

import java.util.ArrayList;

class ReplaceCharToOther{
    public static void main(String[] args) {
        String str = "Java is great";
        String[] str_array = str.split(" ");
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<str_array.length;i++){
            if(i == str_array.length-1){
                list.add(str_array[i]);
                break;
            }
            list.add(str_array[i] + "Shivam");
        }
        String answer = "";
        for(String s : list){
            answer = answer + s + "";
        }
        System.out.println(answer);
    }
}