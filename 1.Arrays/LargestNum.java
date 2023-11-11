public class LargestNum{
    public static int findLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int[] arr = {10,7,17,21,2,5};
        System.out.println("Largest number is: " + findLargest(arr));
    }
}