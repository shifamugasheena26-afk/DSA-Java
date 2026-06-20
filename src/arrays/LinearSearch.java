package arrays;

public class LinearSearch {
    public static int linear(int[] arr , int x){

        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={12,15,25,33,65,73};
        int x = 33;

        System.out.println(linear(arr,x));
    }
}
