//Convert a List to Set and vice-versa
package Batch4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prog32_List2Set2List {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<Integer>();
        alist.add(7);
        alist.add(19);
        alist.add(13);
        alist.add(13);
        alist.add(2);

        Set<Integer> hSet = new HashSet<>(alist);
        System.out.println(hSet);

        List<Integer> arrlist = new ArrayList<>(hSet);
        System.out.println(arrlist);
    }
}
