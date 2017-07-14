package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 4, 2, 4, 4, 2, 4, 4, 1, 1, 1, 1, 1, 1};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        
        int temp,largest = 0;
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for(Entry<Integer, Integer> entry : entrySet){
            temp = entry.getValue();
            if(largest < entry.getValue()){
                largest = entry.getValue();
            }  
        }

        // Get Key from Value
        for(Entry<Integer, Integer> entry : entrySet){
            if (entry.getValue().equals(largest)) {
                    System.out.println(entry.getKey());
            }
        }
            
    }
}