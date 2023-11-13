//Also works for all negative elements in array
public class KadanesAlgo {
    public static void kadanes_algorithm(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            currSum = currSum + arr[i];

            if(maxSum < currSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {-3,-21,-6,-5,-3};
        kadanes_algorithm(arr);
    }
}

/* Output: Maximum Subarray Sum = 8 */