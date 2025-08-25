package Batch1;

import java.util.HashMap;
import java.util.Map;

public class Prog6_CharOccuranceCount {
    public static void main(String[] args) {
        String str = "Balloon";

        System.out.println(charOccCount(str));
    }
    public static Map charOccCount(String string){
        Map<Character,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            for(int j = 0; j < string.length(); j++){
                if(string.charAt(i) == string.charAt(j)){
                    count++;
                }
            }
            map.put(string.charAt(i),count);
            count = 0;
        }
        return map;
    }
}