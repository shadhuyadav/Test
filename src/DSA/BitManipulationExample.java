package DSA;

public class BitManipulationExample {
    //Bit Manipulation: find the unique elements in an array where every element except one appears twice
    public static int singleNumber(int[] nums){
        int result=0;
        for(int num:nums){
            result^=num;

        }
        return result;
    }
    public static void main(String args[]){
        int[] nums={4,1,2,1,2};
        System.out.println("Single number is: "+singleNumber(nums));
    }
}
