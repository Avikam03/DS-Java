package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class duplicateCharacter{
    public static void main(String[] args) {
        DuplicateChar("Manan");
    }

    private static void DuplicateChar(String str) {
        char[] char_array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
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
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}