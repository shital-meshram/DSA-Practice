package BinarySearch;

//Que :: array sorting is not known :: search the target element by binary search
public class OrderAgisticBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,12,16,24,28,68,69,78,89,90,99,100,125,136,175,200};
        int target = 69;
        System.out.println(orderAgosticBinarySearch(arr, target));
    }

    static int orderAgosticBinarySearch(int[] arr, int target) {
        //find if the array is sorted in ass or desc manner
        boolean isAss = arr[0] < arr[arr.length-1];

        int start = 0;
        int end = arr.length-1;

        while(start < end){

            //find mid value
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAss){
                if(target < arr[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            }
        }

        return -1;

    }


}
