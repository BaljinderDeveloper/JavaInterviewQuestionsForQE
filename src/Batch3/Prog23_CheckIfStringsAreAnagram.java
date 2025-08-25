package Batch3;

import java.util.*;

public class Prog23_CheckIfStringsAreAnagram {
    public static void main(String[] args) {
        String str1 = "listeN", str2 = "silent ";
        str1 = str1.toLowerCase().replace(" ","");
        str2 = str2.toLowerCase().replace(" ","");

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int anagram = 1;
        if(ch1.length != ch2.length){
            anagram = 0;
        }else{
            for(char i = 0; i < ch1.length; i++){
                if(ch1[i] != ch2[i]){
                    anagram = 0;
                    break;
                }
            }
        }
        String str = (anagram == 1)? "Anagram" : "Not Anagram";
        System.out.println(str1 + " & " +str2 + " are : "+str);
    }
}