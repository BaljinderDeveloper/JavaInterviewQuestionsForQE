package Batch1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog10_Iterator {
    public static void main(String[] args) {
        //used to loop through a collection - ArrrayList/HashSet...
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Javascript");

        Iterator<String> it = list.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(2);
        alist.add(9);
        alist.add(5);
        alist.add(-1);
        alist.add(7);

        Iterator<Integer> it1 = alist.iterator();
        while(it1.hasNext()){
            if(it1.next() < 5){
                it1.remove();
            }
        }
        System.out.println("after operation: "+alist);
    }
}
