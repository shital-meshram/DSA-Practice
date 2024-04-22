package LinearSearch;

import java.util.Arrays;

//Que : Find Min Value form the given Array
public class FindMinValue {

    public static void main(String[] args) {
        int[] arr={8,1,48,26,31,2,20,-99};

        System.out.println(findMinOfArray(arr));
        System.out.println(findMinOfArrayForEach(arr));
        System.out.println(findMinOfArrayByUsingStreamApi(arr));
    }

    //find min number from the array
    static int findMinOfArray(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }

        }
        return minValue;
    }

    //find min number from the array for each loop
    static int findMinOfArrayForEach(int[] arr){
        int minValue = Integer.MAX_VALUE;
        for(int i : arr){
            if(i < minValue){
                minValue = i;
            }
        }
        return minValue;
    }

    //Using Stream Api

    static int findMinOfArrayByUsingStreamApi(int[]arr){
        return Arrays.stream(arr).min().getAsInt();
    }


}
