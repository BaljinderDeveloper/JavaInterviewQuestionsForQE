package Batch1;

import java.util.HashMap;
import java.util.Map;

public class Prog6_CharOccuranceCount_2 {
    public static void main(String[] args) {
        String str = "Balloon";

        Map<Character,Integer> map = new HashMap<>();

        for(Character ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}