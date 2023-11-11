public class PrintSubArray {
    public static void print(int[] arr){
        int ts = 0; //total subarrays
        for(int i = 0; i< arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + ts);

    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        print(arr);
    }
}

/* Output:
    2 
    2 4
    2 4 6
    2 4 6 8
    2 4 6 8 10

    4
    4 6
    4 6 8
    4 6 8 10

    6
    6 8
    6 8 10

    8
    8 10

    10

    Total Subarrays = 15
 */
