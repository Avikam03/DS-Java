package practice;

public class NoOfVowels {
    public static void main(String[] args) {
        vowelsAndConsonants("Daniel");
    }

    private static void vowelsAndConsonants(String str) {
        int vowels = countVowels(str);
        int conso = str.length() - vowels;
        System.out.println("Vowels - " + vowels + ", " + "Consonants - " + conso);
    }

    private static int countVowels(String str) {
        char[] char_array = str.toCharArray();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(char_array[i] == 'a' || char_array[i] == 'e' || char_array[i] == 'i' || char_array[i] == 'o' || char_array[i] == 'u'){
                count++;
            }
        }
        return count;
    }
}
