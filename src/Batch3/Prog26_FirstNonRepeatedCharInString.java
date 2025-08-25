package Batch3;

public class Prog26_FirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String str ="programming";
        char[] ch = str.toCharArray();

        char c = 0;
        int flag = 0;
        for(int i = 0; i < ch.length; i++){
            for(int j = i+1; j < ch.length; j++){
                if(ch[i] != ch[j]){
                    c = ch[i];
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                break;
        }
        System.out.println(c);
    }
}