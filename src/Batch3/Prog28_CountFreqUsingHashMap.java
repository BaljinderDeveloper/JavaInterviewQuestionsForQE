package Batch3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog28_CountFreqUsingHashMap {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('a');list.add('v');list.add('i');list.add('c');list.add('k');
        list.add('y');list.add('y');list.add('v');list.add('a');list.add('a');

        Map<Character,Integer> map = new HashMap<>();
        for(char ch : list){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(list);
        System.out.println(map);
        System.out.println(map.get('a'));
    }
}