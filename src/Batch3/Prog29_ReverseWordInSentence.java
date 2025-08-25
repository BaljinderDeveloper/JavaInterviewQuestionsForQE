package Batch3;

import java.util.Arrays;

public class Prog29_ReverseWordInSentence {
    public static void main(String[] args) {
        String str = "My name is Baljinder";

        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        StringBuffer sb = new StringBuffer();
        for(int i = strArr.length-1; i >= 0; i--){
            sb.append(strArr[i]);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}