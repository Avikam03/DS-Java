package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonDuplicateChar {
    public static void main(String[] args) {
        nonduplicateChar("shivam");
    }

    private static void nonduplicateChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] char_array = str.toCharArray();
        for(Character ch : char_array){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
        
        
    }
}
