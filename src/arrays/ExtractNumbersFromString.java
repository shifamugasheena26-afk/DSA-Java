package arrays;

import java.util.ArrayList;

public class ExtractNumbersFromString {
    public static void main(String[] args){
        String str ="1:Prakhas Agarwal , 2: Manish kumar rai ,  3: Risha gugeks56";
        ArrayList <String> list = new ArrayList<>();
        StringBuilder num = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }else{
                if(!num.isEmpty()){
                    list.add(num.toString());
                    num.setLength(0);
                }
            }
        }
        if(!num.isEmpty()){
            list.add(num.toString());

        }
        System.out.println(list);
    }
}