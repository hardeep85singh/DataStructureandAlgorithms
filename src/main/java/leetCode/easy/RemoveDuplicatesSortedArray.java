package leetCode.easy;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String [] args){
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesConstantSpace(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;

        if(length == 0 || length == 1) {
            return length;
        }

        int [] temp = new int[length];
        int j = 0;
        for(int i = 0; i< length -1; i++){
            if(nums[i] != nums[i+1]){
                temp[j] = nums[i];
                j++;
            }
        }
        temp[j] = nums[length-1];
        j++;

        for (int i = 0; i < j; i++){
            nums[i] = temp[i];
        }
        return j;
    }

    public static int removeDuplicatesConstantSpace(int [] nums){
        int length = nums.length;

        if(length == 0 || length == 1) {
            return length;
        }

        int j = 0;
        for (int i = 0; i< length -1; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[length-1];
        j++;
        return j;

    }
}
