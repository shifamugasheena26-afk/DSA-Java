package arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] arr={5,2,9,1,6};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
