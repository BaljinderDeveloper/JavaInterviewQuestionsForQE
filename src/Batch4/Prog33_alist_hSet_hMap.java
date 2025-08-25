//Use of ArrayList, HashSet, and HashMap in code
package Batch4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Prog33_alist_hSet_hMap {
    public static void main(String[] args) {
//        ArrayList - used for sorting (contains methods)
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Apple");
        alist.add("Blackberry");
        alist.add("Kiwi");
        alist.add("Mango");
        System.out.println("ArrayList : "+alist);

//        Hashset - used for eliminating duplicates
        HashSet<String> hset = new HashSet<>();
        hset.add("Apple");
        hset.add("Apple");
        hset.add("Kiwi");
        hset.add("Guava");
        System.out.println("HashSet : "+hset);

//        HashMap - used for key value pair
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("Apple",8);
        hmap.put("Mango",7);
        hmap.put("Guava",2);
        hmap.put("Kiwi",3);
        System.out.println("HashMap : "+hmap);
        System.out.println("Apple count :"+hmap.get("Apple"));
    }
}
