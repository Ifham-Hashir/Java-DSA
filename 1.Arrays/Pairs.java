public class Pairs {
    public static void print_pairs(int[] arr){
        int tp=0; //total pairs
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+ arr[i] + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = " + tp);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,10,11};
        print_pairs(arr);
    }
}

/* Output:
    (1,5) (1,7) (1,10) (1,11) 
    (5,7) (5,10) (5,11)
    (7,10) (7,11)
    (10,11)

    Total Pairs = 10
 */
