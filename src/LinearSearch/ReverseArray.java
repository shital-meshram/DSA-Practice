package LinearSearch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Que :: Reverse the given Array
public class ReverseArray {

    public static void main(String[] args) {
        //Normal Integer Array Initialization
        int[] arr = {1,2,3,4,5,6,7,8,9,45,9,52,4,566,4,78,844,6,8,744,456,46,4,74};

        //Stream Api Integer Array Initialization
        List<Integer> arrayStream = Arrays.asList(1,2,3,4,5,6,7,8,9,45,9,52,4,566,4,78,844,6,8,744,456,46,4,74);

        System.out.println( "Using Normal For Loop and ArrayList :: " + reverseElementOfArray(arr));
        System.out.println( "Using Normal For Loop and new Array :: " + Arrays.toString(reverseElementOfArray2(arr.length,arr)));
        System.out.println( "Using Stream Api with Primitive Array :: i.e int[] arr (Sort and Reverse)==> " + Arrays.toString(reverseElementOfArrayUsingStreamApiPrimitive(arr)));// streamApi //for primitive ( int array int[]arr )
        System.out.println( "Using Stream Api with Wrapper Array :: i.e List<Integer> arr ==> " + reverseElementOfArrayUsingStreamApiWrapper1(arrayStream)); // streamApi //for Wrapper List<Integer>
        System.out.println( "Using Stream Api with Wrapper Array :: i.e List<Integer> arr ==> " + reverseElementOfArrayUsingStreamApiWrapper2(arrayStream));
    }


    //using ArrayList
     static List<Integer> reverseElementOfArray(int[] arr) {
        List<Integer> revArr = new ArrayList<Integer>();

        for(int i=arr.length-1; i >=0; i--){
            revArr.add(arr[i]);
        }

        return revArr;
    }

    //using New Array
    static int[] reverseElementOfArray2(int size, int[] arr) {
        int[] revArr = new int[size+1];

        for(int i=arr.length-1, j=0; i >=0; i--, j++){
            revArr[j]=arr[i];
        }

        return revArr;
    }

    //Using Stream Api Sort and Reverse
    static int[] reverseElementOfArrayUsingStreamApiPrimitive(int[] arr) {
        return Arrays.stream(arr)
                .boxed()//To convert from a stream of primitives to a stream of objects, these classes provide boxed() method
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

    }

    //Reverse using Collect()
    static List<Integer> reverseElementOfArrayUsingStreamApiWrapper1(List<Integer> arr) {

        List<Integer> collect = arr.stream().collect(Collectors.toList());
        Collections.reverse(collect);
        return collect;


    }

    //Reverse using Collect() and collectingAndThen()
    static List<Integer> reverseElementOfArrayUsingStreamApiWrapper2(List<Integer> arr) {
        List<Integer> collect = arr.stream().collect(
                Collectors. collectingAndThen(
                        Collectors.toList(), l -> {Collections.reverse(l); return l;}
                ));
        return collect;
    }
}
