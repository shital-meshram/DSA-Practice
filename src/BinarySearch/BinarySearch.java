package BinarySearch;

//Que :: find the target value in an given array by Binary Search Algorithm
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,12,16,24,28,68,69,78,89,90,99,100,125,136,175,200};
        int target = 69;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        //step 1 :: initialize start and end point of the array
        int start = 0;
        int end = arr.length-1;

        //step 2 :: till start less than equal to end run the loop
        while(start <= end){
            //step 3 :: find mid element
            int mid = (start+end)/2;

            if(target <arr[mid]){ // check if target value if is less than mid value then shift left pointer to mid-1 position;
                end = mid-1;
            } else if (target > arr[mid]) { // check if target value if is less than mid value then shift left pointer to mid+1 position;
                start = mid+1;
            }else{
                return mid; //mid==target
            }
        }
        return -1;

    }
}
