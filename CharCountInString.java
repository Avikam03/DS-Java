package practice;

public class CharCountInString {
    public static void main(String[] args) {
        System.out.println(getCount("Java", 'a'));
    }

    private static int getCount(String str, Character a) {
        int count = 0;
        char[] char_array = str.toCharArray();
        for(Character ch : char_array){
            if(ch == a){
                count++;
            }
        }
        return count;
    }
}
