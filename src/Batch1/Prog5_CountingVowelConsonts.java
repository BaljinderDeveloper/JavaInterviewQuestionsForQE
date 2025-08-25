package Batch1;

import java.util.*;

public class Prog5_CountingVowelConsonts {
    public static void main(String[] args) {
        String str = "    aeiouAEIOU   pqrstPQ";
        str = str.toLowerCase().replace(" ","");

        System.out.println(str+" contains : "+vcCount(str));
    }
    public static Map<String,Integer> vcCount(String string){
        int vcount = 0, ccount = 0;
        for(char ch : string.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vcount++;
            } else if (ch >= 97 && ch <= 122 && ch != 'a' && ch != 'e' &&
                    ch != 'i' && ch != 'o' && ch != 'u') {
                ccount++;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("vowels",vcount);
        map.put("consonants",ccount);
        return map;
    }
}