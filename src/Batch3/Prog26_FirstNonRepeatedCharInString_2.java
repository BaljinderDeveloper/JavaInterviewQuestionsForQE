package Batch3;

import java.util.HashMap;
import java.util.Map;

public class Prog26_FirstNonRepeatedCharInString_2 {
    public static void main(String[] args) {
        String str ="propgramming";
        char[] ch = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(char c : ch){
//            map.put(c,map.getOrDefault(c,0)+1);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        for(char c : ch){
            if (map.get(c) == 1 ) {
                System.out.println(c);
                break;
            }
        }
    }
}