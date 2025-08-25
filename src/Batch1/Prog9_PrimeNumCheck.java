package Batch1;

public class Prog9_PrimeNumCheck {
    public static void main(String[] args) {
        int num = 23;

        System.out.println(num+" is a Prime num: "+primeNumCheck(num));

    }
    public static Boolean primeNumCheck(int value){
        Boolean flag = true;
        for(int i = 2; i < value; i++){
            if(value % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
