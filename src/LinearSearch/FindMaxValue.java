package LinearSearch;


import java.util.Arrays;

//Que : Find Max Value form the given Array
public class FindMaxValue {

    public static void main(String[] args) {
        int[] arr ={45,10,23,7896,64654,124,745,36,11111111};

        System.out.println(findMaxValue(arr));
        System.out.println(findMaxValueForEach(arr));
        System.out.println(findMaxValueUsingStreamApi(arr));
    }

    static int findMaxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;

    }

     static int findMaxValueForEach(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
         for (int i:arr) {
            if(i > maxValue){
                maxValue = i;
            }
         }
         return maxValue;
    }

    //Using Stream Api
    static int findMaxValueUsingStreamApi(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
}
