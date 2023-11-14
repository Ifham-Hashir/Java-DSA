/*Given an integer array nums, return true if any value appears at least twice 
in the array, and return false if every element is distinct*/
public class Duplicate {
    public static boolean containsDuplicate(int[] nums){
        for(int i=0; i<nums.length-1 ; i++){ 
            for(int j=i+1; j<nums.length ; j++ ){ 
                if( nums[i] == nums[j] ){
                     return true ; 
                } 
            } 
         } 
            return false; 
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,4,5,6};
        System.out.println(containsDuplicate(nums));
    }
}
