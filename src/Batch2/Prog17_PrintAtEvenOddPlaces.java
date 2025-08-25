package Batch2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prog17_PrintAtEvenOddPlaces {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("Even places' value : ");
        for(int i = 0 ; i < list.size(); i=i+2){
            if( i % 2 == 0){
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println("");
        System.out.print("Even places' value : ");
        for(int i = 1 ; i < list.size(); i=i+2){
            if( i % 2 == 1){
                System.out.print(list.get(i)+" ");
            }
        }
    }
}