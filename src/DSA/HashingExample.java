package DSA;

import java.util.HashSet;

public class HashingExample {
    //HashSet: Finds the length of the longest consecutive sequence in an array using a HashSet
    public static int longestConsecutive(int nums[]){
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
            int longest=0;
            for(int num:set){
                if(!set.contains(num-1)){
                    int currentNum=num;
                    int steak=1;
                    while(set.contains(currentNum+1)){
                        currentNum++;
                        steak++;
                    }
                    longest=Math.max(longest,steak);

                }
        }
            return longest;

    }
    public static void main(String args[]){
        int nums[]={100,4,200,1,3,2};
        System.out.println("Longest consecutive sequence length: "+longestConsecutive(nums));
    }
}
