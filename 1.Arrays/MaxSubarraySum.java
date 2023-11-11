//MaxSubarraySum-I (Brute force approach)
public class MaxSubarraySum {
    public static void findMaxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int currSum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }
                System.out.print("= " + currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Subarray Sum = " + maxSum);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        findMaxSum(arr);
    }
}

/* Output:
    2 = 2
    2 4 = 6
    2 4 6 = 12
    2 4 6 8 = 20
    2 4 6 8 10 = 30

    4 = 4
    4 6 = 10
    4 6 8 = 18
    4 6 8 10 = 28

    6 = 6
    6 8 = 14
    6 8 10 = 24

    8 = 8
    8 10 = 18

    10 = 10

    Maximum Subarray Sum = 30
 */
