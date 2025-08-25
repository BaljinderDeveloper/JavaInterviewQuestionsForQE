package Batch2;

import java.util.ArrayList;
import java.util.List;

public class Prog11_SumOfitsDigits {
    public static void main(String[] args) {
        int num = 2351;

        System.out.println("Sum of its digits : "+sumOfIndividualDigits(num));

    }
    public static int sumOfIndividualDigits(int number){
        List<Integer> list = new ArrayList<>();
        int digit = 0;
        while(number != 0){
            digit = number%10;
            list.add(digit);
            number /= 10;
        }
        System.out.println(list);
        int i = 0, result = 0;
        while(i < list.size()){
            result += list.get(i);
            i++;
        }
        return result;
    }
}