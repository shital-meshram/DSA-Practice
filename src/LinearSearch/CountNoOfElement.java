package LinearSearch;


import java.util.Arrays;

//Que : Count the number of element present in the array
public class CountNoOfElement {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,45,9,52,4,566,4,78,844,6,8,744,456,46,4,74};
        System.out.println(findNumberOfElementinArray(arr));
        System.out.println(findNumberOfElementinArrayUsingStreamApi(arr));
    }

    static int findNumberOfElementinArray(int[] arr) {

        int count = 0;
        for(int i : arr){
            count++;
        }

        return count;
    }

    //Using Stream Api
    static int findNumberOfElementinArrayUsingStreamApi(int[] arr) {
        return ((int) Arrays.stream(arr).count());
    }

}
