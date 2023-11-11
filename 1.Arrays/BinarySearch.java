//Prerequisite - Sorted Array
public class BinarySearch {
    public static int search(int[] arr, int target){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            //left
            else if(arr[mid] < target){
                start = mid+1;
            }
            //right
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr = {1,3,5,7,9,11,13,14,15,25};
        int target = 11;
        int index = search(arr, target);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is at index: " + index);
        }
    }
}
